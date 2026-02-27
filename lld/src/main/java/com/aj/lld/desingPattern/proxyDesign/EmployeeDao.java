package com.aj.lld.desingPattern.proxyDesign;

public class EmployeeDao implements IEmployeeDao {

	@Override
	public String createEmployee(String client, String empDetails) {
		return "Successfully created";
	}

	@Override
	public String getEmployeeDetails(String client, String empId) {
		return "EmployeeName AJ";
	}

}
