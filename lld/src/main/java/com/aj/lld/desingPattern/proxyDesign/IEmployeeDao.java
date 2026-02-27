package com.aj.lld.desingPattern.proxyDesign;

public interface IEmployeeDao {
	public String createEmployee(String client, String empDetails);
	public String getEmployeeDetails(String client,String empId);
}
