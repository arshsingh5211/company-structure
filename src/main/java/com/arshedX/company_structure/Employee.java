package com.arshedX.company_structure;

import java.util.ArrayList;
import java.util.List;

public abstract class Employee {
	
	private static int count;
	private String name;
	private int employeeId;
	private Employee manager;
	private double baseSalary;
	private List<Employee> directReportsList = new ArrayList<Employee>();



	public Employee(String name, double baseSalary) {
		this.name = name;
		this.baseSalary = baseSalary;
		this.employeeId = count + 1;
		count++;
	}
	
	public String getName() {
		return name;
	}

	public Employee getManager() {
		return manager;
	}
	
	public void setManager(Employee manager){
        this.manager = manager;
    }
	
	public int getEmployeeId() {
		return employeeId;
	}
	
	
	public double getBaseSalary() {
		return baseSalary;
	}
	
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	public List<Employee> getDirectReportsList() {
		return directReportsList;
	}
	
	public boolean equals(Employee other) {
		if (this.employeeId == other.employeeId) {
			return true;
		}
			return false;
	}
	
	public String toString() {
		return employeeId + " " + name;
	}
	
	abstract String employeeStatus();
}