package com.spring.mvc.model;

public class Employee 
{
	private String email_address;
	private String employee_name;
	private String password;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String email_address, String employee_name, String password) {
		super();
		this.email_address = email_address;
		this.employee_name = employee_name;
		this.password = password;
	}

	public String getEmail_address() {
		return email_address;
	}

	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Employee [employee_address=" + email_address + ", employee_name=" + employee_name
				+ ", password=" + password + "]";
	}
	
	
}
