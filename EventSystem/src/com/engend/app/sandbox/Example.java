package com.engend.app.sandbox;

import com.engend.app.event.Event;
import com.engend.app.layer.Layer;

public class Example extends Layer {

	public void onEvent(Event event) {
		System.out.println("Event:" + event.getType());
	}
}
