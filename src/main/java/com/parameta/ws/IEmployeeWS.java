package com.parameta.ws;


import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface IEmployeeWS {
	
	@WebMethod
	public String getEmployee(String name);

}
