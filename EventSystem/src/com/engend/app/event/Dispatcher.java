package com.engend.app.event;

public class Dispatcher {

	private Event event;
	
	public Dispatcher(Event event) {
		this.event = event;
	}
	
	public void dispatch(Event.Type type, EventHandler e) {
		
		if(event.handle)
			return;
		
		if(event.getType() == type) {
			event.handle = e.handler(event);
		}
		
	}
	
}
