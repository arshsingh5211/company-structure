package com.arshedX.company_structure;

public class SoftwareEngineer extends TechnicalEmployee {
	private boolean codeAccess;
	private int successfulCheckIns;

	public SoftwareEngineer(String name) {
		super(name);
		this.codeAccess = false;
		this.successfulCheckIns = 0;
	}

	public boolean getCodeAccess() {
		return codeAccess;	
	}
	
	public void setCodeAccess(boolean access) {
		this.codeAccess = access;
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
}
