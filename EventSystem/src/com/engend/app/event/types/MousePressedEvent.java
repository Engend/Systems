package com.engend.app.event.types;

import com.engend.app.event.Event;

public class MousePressedEvent extends MouseButtonEvent {
	
	public MousePressedEvent(int keyCode, int x, int y) {
		super(Event.Type.MOUSE_PRESSED, keyCode, x, y);
	}
}
