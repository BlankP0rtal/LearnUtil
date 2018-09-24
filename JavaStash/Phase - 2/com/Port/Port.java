package com.Port;

import com.Data.*;

enum PortType{
	usb2,
	usb3_1,
	usbC;
}

public class Port{
	private Data data;
	PortType portType;

	public Data getData(){
		return this.data;
	}

	public int sendData(Data data){
		this.data = data;
		System.out.println("Data is send to bus interface by giving the inturrupt");
		return 0;
	}
}