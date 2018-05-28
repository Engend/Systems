package com.engend.app.event;

public class Event {
	
	public enum Type {
		MOUSE_MOVED,
		MOUSE_RELEASED,
		MOUSE_PRESSED,
	}
	
	private Type type;
	public boolean handle;
	
	public Event(Type type) {
		this.type = type;
	}

	public Type getType() {
		return type;
	}
	
}
