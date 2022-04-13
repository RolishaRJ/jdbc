package com.jdbctask.service;

import com.jdbctask.model.Employee;

public interface Service {
	public void insert(Employee emplyee);

	public void updateCity(int employeeId, String city);

	public void delte(int employeeId);

	public void fetchAllEmployee();

}
