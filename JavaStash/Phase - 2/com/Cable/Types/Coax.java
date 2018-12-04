package com.Cable.Types;

import com.Port.*;
import com.Cable.*;
import com.Data.*;

public class Coax implements Cable{
	private Port port; //instead of this we can have device.
	public void setPort(Port port){
		this.port = port;
	}
	public Data getData(){
		return this.port.getData(); 
	}
	public int sendData(Data data) throws Exception{
		return this.port.sendData(data); //return the repsonse for the recent transimission status
	}
}