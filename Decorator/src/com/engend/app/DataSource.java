package com.engend.app;

public interface DataSource {
	
	void writeData(String data);
	
	String readData();
}
