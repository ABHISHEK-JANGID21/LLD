package com.aj.lld.desingPattern.proxyDesign;

public class EmployeeDaoProxy implements IEmployeeDao {
	
	IEmployeeDao empDao;
	
	public EmployeeDaoProxy() {
		empDao = new EmployeeDao();
	}
	
	

	@Override
	public String createEmployee(String client, String empDetails) {
		if(client.equals("ADMIN")) {
			return empDao.createEmployee(client, empDetails);
		}
		return "no access";
	}

	@Override
	public String getEmployeeDetails(String client, String empId) {
		if(client.equals("ADMIN") || client.equals("USER")) {
			return empDao.getEmployeeDetails(client, empId);
		}
		
		return "no access";
	}

}
