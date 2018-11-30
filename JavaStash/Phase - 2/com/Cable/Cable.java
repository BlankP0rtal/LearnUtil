package com.Cable;

import com.Data.*;

public interface Cable {
	Data getData();
	int sendData(Data data) throws Exception;
}