package com.arshedX.company_structure;

public class Accountant extends BusinessEmployee {
	private double bonusBudget;
	private TechnicalLead teamSupported;

	public Accountant(String name) {
		super(name);
		this.bonusBudget = 0.0;
		this.teamSupported = null;
	}
	
	public TechnicalLead getTeamSupported() {
		if (teamSupported == null) {
			return null;
		}
		else return teamSupported;
	}
	
	public void supportTeam(TechnicalLead lead) {
		this.teamSupported = lead;
		this.bonusBudget = (lead.getTotalTeamSalary(lead.getDirectReportsList()) + (0.1 * lead.getTotalTeamSalary(lead.getDirectReportsList())));
	}
	
	public double getBonusBudget() {
		return bonusBudget;
	}

	public boolean approveBonus(double bonus) {
		if ((bonus > bonusBudget) || teamSupported == null) {
			return false;
		}
			return true;
	}
	
	public String employeeStatus() {
		return super.toString() + " with a budget of $" + bonusBudget + " is supporting " + teamSupported;
	}
	
	

}
