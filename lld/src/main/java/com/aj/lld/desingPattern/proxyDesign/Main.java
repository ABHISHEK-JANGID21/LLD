package com.aj.lld.desingPattern.proxyDesign;

public class Main {
	
	public static void main(String args[]) {
		IEmployeeDao employeeDao = new EmployeeDaoProxy();
		employeeDao.createEmployee("ADMIN", "adsfasdf");
		employeeDao.getEmployeeDetails("USER", "adsfadsf");
		}

}
