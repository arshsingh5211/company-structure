package com.arshedX.company_structure;

abstract class TechnicalEmployee extends Employee {
	private int successfulCheckIns;
	private boolean codeAccess;

	public TechnicalEmployee(String name) {
		super(name, 75000.00);
	}
	
	public String employeeStatus() {
		return super.toString() + " has " + this.getSuccessfulCheckIns(codeAccess) + " successful check-ins";
	}
	
	public int getSuccessfulCheckIns(boolean isCheckedIn) {
		return successfulCheckIns;
	}
	
	public boolean checkInCode() {
		if (codeAccess) {
			successfulCheckIns++;
			return true;
		} setCodeAccess(false);
			return false;
	}

	public void setCodeAccess(boolean access) {
		this.codeAccess = access;
	}

}