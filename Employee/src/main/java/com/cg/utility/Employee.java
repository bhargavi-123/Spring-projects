package com.cg.utility;

public class Employee {
	private  String employeName;
	private  int employeeId;
	private double salary;
	public String getEmployeName() {
		return employeName;
	}
	public void setEmployeName(String employeName) {
		this.employeName = employeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	@Override
	public String toString() {
		return "Employee [employeName=" + employeName + ", employeeId="
				+ employeeId + ", salary=" + salary + "]";
	}
	
	

}
