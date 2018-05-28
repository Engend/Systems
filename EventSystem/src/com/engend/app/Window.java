package com.engend.app;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferStrategy;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import com.engend.app.event.Event;
import com.engend.app.event.types.MouseMovedEvent;
import com.engend.app.event.types.MousePressedEvent;
import com.engend.app.event.types.MouseReleasedEvent;
import com.engend.app.layer.Layer;

public class Window extends Canvas {
	
	private Graphics g;
	private BufferStrategy bs;
	private JFrame frame;
	private List<Layer> layers = new ArrayList<Layer>();
	
	public Window(String name, int height, int width) {
		setPreferredSize(new Dimension(height, width));
		init(name);
		
		addMouseListener(new MouseAdapter() {
			
			public void mousePressed(MouseEvent e) {
				MousePressedEvent event = new MousePressedEvent(e.getButton(), e.getX(), e.getY());
				onEvent(event);
			}
			
			public void mouseReleased(MouseEvent e) {
				MouseReleasedEvent event = new MouseReleasedEvent(e.getButton(), e.getX(), e.getY());
				onEvent(event);
			}
			
		});
		
		addMouseMotionListener(new MouseMotionListener() {
			

			public void mouseMoved(MouseEvent e) {
				MouseMovedEvent event = new MouseMovedEvent(e.getX(), e.getY(), false);
				onEvent(event);
			}

			public void mouseDragged(MouseEvent e) {
				MouseMovedEvent event = new MouseMovedEvent(e.getX(), e.getY(), true);
				onEvent(event);
			}
		});
		
		render();
	}
	
	private void init(String name) {
		frame = new JFrame(name); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(this);
		frame.pack();
		frame.setVisible(true);
		frame.setResizable(false);
	}
	
	private void render() {
		if(bs == null)
			createBufferStrategy(3);
		bs = getBufferStrategy();
		
		g = bs.getDrawGraphics();
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, getHeight(), getWidth());
		onRender(g);
		g.dispose();
		bs.show();
		
		try {
			Thread.sleep(3);
		} catch (InterruptedException e) {
			
		}	EventQueue.invokeLater(() -> render());
	}
	
	public void onRender(Graphics g) {
		for(int i = 0; i < layers.size(); i++)
			layers.get(i).onRender(g);
	}
	
	public void onEvent(Event event) {
		for(int i = layers.size() - 1; i >= 0; i--)
			layers.get(i).onEvent(event);
	}
	
	public void addLayer(Layer layer) {
		layers.add(layer);
	}
	
}
