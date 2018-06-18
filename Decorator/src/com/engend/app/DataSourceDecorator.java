package com.engend.app;

import javax.xml.crypto.Data;

public class DataSourceDecorator implements DataSource {
	
	private DataSource wrappee;

	public DataSourceDecorator(DataSource source) {
		this.wrappee = source;
	}

	public void writeData(String data) {
		wrappee.writeData(data);
	}

	public String readData() {
		return wrappee.readData();
	}
	
	
}
