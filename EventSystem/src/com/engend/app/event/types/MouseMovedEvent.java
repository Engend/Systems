package com.engend.app.event.types;

import com.engend.app.event.Event;

public class MouseMovedEvent extends Event {
	
	private boolean dragged;
	private int x, y;

	public MouseMovedEvent(int x, int y, boolean dragged) {
		super(Event.Type.MOUSE_MOVED);
		this.dragged = dragged;
		this.x = x;
		this.y = y;
	}

	public boolean isDragged() {
		return dragged;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	
}
