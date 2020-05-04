package com.arshedX.company_structure;

public class BusinessLead extends BusinessEmployee {

	private int headCount;
	private double bonusBudget;
	private Accountant a;
	

	public BusinessLead(String name) {
		super(name);
		super.setManager(this);
		setBaseSalary(super.getBaseSalary() * 2);
		this.headCount = 10;
	}

	public boolean hasHeadCount() {
		if (getDirectReportsList().size() < headCount) {
			return true;
		}
			return false;
	}
	
	
	public boolean addReport(Accountant e, TechnicalLead supportTech) {
		if (this.hasHeadCount()) {
			e.setManager(this);
			super.getDirectReportsList().add(e);
			this.bonusBudget = e.getBaseSalary() * 1.1;
			e.supportTeam(supportTech);
			return true;
		}
			return false;
	}
	
	public boolean requestBonus(Employee e, double bonus) {
		if (this.bonusBudget + bonus < bonusBudget) {
			this.approveBonus(e, bonus);
			this.bonusBudget -= bonus;
			return true;
		}
			return false;
	}
	
	/*
	 This function should look through the Accountants the BusinessLead manages, and if any of them are 
	 supporting a the TechnicalLead that is the manager of the Employee passed in then the Accountant's budget 
	 should be consulted to see if the bonus could be afforded. If the team can afford the bonus it should be 
	 rewarded and true returned, false otherwise
	 */
	
	public boolean approveBonus(Employee e, double bonus) {
	// if accountant supports the e's manager then consult that accountant's budget to see if it can afford bonus
	// if teamSupported can afford bonus then reward bonus, return true
		if (e.getManager().equals(a.getTeamSupported()) && a.approveBonus(bonus)) {
			this.bonusBudget += bonus;
			return true;
		}
			return false;
	}

	public double getBonusBudget() {
		return Math.round(bonusBudget * 1.000) / 1.000; // values truncated incorrectly, should use BigDecimal to be accurate
	}

	public String getTeamStatus() {
		if (getDirectReportsList().size() == 0) {
			return super.employeeStatus() + " and no direct reports yet";
		}
			StringBuilder teamStatusList = new StringBuilder();
			for (int i = 0; i < getDirectReportsList().size(); i++) {
				teamStatusList.append(getDirectReportsList().get(i).employeeStatus() + " \n\t");
			}
				return super.employeeStatus() + " and is managing: \n" + "\t" + teamStatusList.toString().trim() + "\n------------------------------------------------------------------------";
	}

}
