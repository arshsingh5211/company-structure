package com.arshedX.company_structure;

import java.util.List;

public class TechnicalLead extends TechnicalEmployee{
	private int headCount;
	//private TechnicalLead team;
	@SuppressWarnings("unused")
	private double totalTeamSalary;
	private BusinessLead b;
	
	public TechnicalLead(String name) {
		super(name);
		setBaseSalary(super.getBaseSalary() * 1.3);
		this.headCount = 4;
		this.setCodeAccess(true);
	}
	
	public boolean hasHeadCount() {
		if (super.getDirectReportsList().size() < headCount) {
			return true;
		}
			return false;
	}
	
	public void setHeadCount(int headCount) {
		this.headCount = 5;
	}
			
	public boolean addReport(SoftwareEngineer e) {
		if (hasHeadCount()) {
			getDirectReportsList().add(e);
			e.setManager(this);
			return true;
		}
			return false;
	}
	
	public boolean approveCheckIn(SoftwareEngineer e) {
		if ((e.getManager().equals(this)) && (e.getCodeAccess())) {
			return true;
		}
			return false;
	}
	
	public boolean requestBonus(Employee e, double bonus) {
		if (b.approveBonus(e, bonus)) {
			b.approveBonus(e, bonus);
			return true;
		}
			return false;
	}
	
	
	// Should check if the bonus amount requested would be approved by the BusinessLead supporting this 
	// TechnicalLead. If it is, that employee should get that bonus and true should be returned. False should be 
	// returned otherwise
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

	public double getTotalTeamSalary (List<Employee> directReportsList) {
		double sum = 0.0;
		for (int i = 0; i < directReportsList.size(); i++) {
			sum += directReportsList.get(i).getBaseSalary();
		}
			return sum;
	}

}
