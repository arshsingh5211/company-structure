package com.arshedX.company_structure;

abstract class BusinessEmployee extends Employee {

	public BusinessEmployee(String name) {
		super(name, 50000);
	}

	public String employeeStatus() {
		return super.getEmployeeId() + " " + super.getName() + " with a budget of $" + getBonusBudget();

	}

	abstract double getBonusBudget();

}
