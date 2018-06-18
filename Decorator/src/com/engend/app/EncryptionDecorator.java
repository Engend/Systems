package com.engend.app;

import java.util.Base64;

import javax.xml.crypto.Data;

public class EncryptionDecorator extends DataSourceDecorator {

	public EncryptionDecorator(DataSource source) {
		super(source);

	}

	public void writeData(String data) {
		super.writeData(encode(data));
	}
	
	public String readData() {
		return decode(super.readData());
	}
	
	public String encode(String data) {
		byte[] result = data.getBytes();
		for(int i = 0; i < result.length; i++) {
			result[i] += (byte) 1;
		}
		
		return Base64.getEncoder().encodeToString(result);
	}
	
	public String decode(String data) {
		byte[] result = Base64.getDecoder().decode(data);
		for(int i = 0; i < result.length; i++) {
			result[i] -= (byte) 1;
		}
		
		return new String(result);
	}
	
}
