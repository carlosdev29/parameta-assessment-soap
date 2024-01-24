package com.parameta.ws.impl;

import javax.jws.WebService;

import com.parameta.ws.IEmployeeWS;



@WebService(endpointInterface = "com.parameta.ws.IEmployeeWS")
public class EmployeeWS implements IEmployeeWS{
	
	
	public String getEmployee(String name) {
		// TODO Auto-generated method stub
		name = "Carlos";
		return name;
	}
}
