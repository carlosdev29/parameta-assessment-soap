package com.parameta.ws.impl;

import javax.xml.ws.Endpoint;

public class EmployeePublish {
	
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:1515/WS/IEmployeeWS", new EmployeeWS());
	}
	

}
