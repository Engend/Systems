package com.engend.app.event;

import java.awt.Graphics;

public interface EventListener {

	public void onEvent(Event e);
	
	public void onRender(Graphics g);
	
}
