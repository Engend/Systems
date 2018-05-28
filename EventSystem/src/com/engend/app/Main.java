package com.engend.app;

import com.engend.app.sandbox.Example;

public class Main {
	
	public static void main(String[] args) {
		Window window = new Window("Window", 500, 500);
		window.addLayer(new Example());
	}
	
}
