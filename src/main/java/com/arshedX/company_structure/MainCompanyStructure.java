package com.arshedX.company_structure;

public class MainCompanyStructure {

	public static void main(String[] args) {
		TechnicalLead CTO = new TechnicalLead("Satya Nadella");
        SoftwareEngineer seA = new SoftwareEngineer("Kasey");
        SoftwareEngineer seB = new SoftwareEngineer("Breana");
        SoftwareEngineer seC = new SoftwareEngineer("Eric");
        SoftwareEngineer seH = new SoftwareEngineer("Elliot Alderson");
        int a = 4;
        System.out.println(a);
        CTO.addReport(seA);
        CTO.addReport(seB);
        CTO.addReport(seC);
        CTO.addReport(seH);
        CTO.checkInCode();

        System.out.println(CTO.getTeamStatus());

        TechnicalLead VPofENG = new TechnicalLead("Bill Gates");
        SoftwareEngineer seD = new SoftwareEngineer("Winter");
        SoftwareEngineer seE = new SoftwareEngineer("Libby");
        SoftwareEngineer seF = new SoftwareEngineer("Gizan");
        SoftwareEngineer seG = new SoftwareEngineer("Zaynah");
        SoftwareEngineer analyst = new SoftwareEngineer("Carrie");
        VPofENG.setHeadCount(7);
        VPofENG.addReport(seD);
        VPofENG.addReport(seE);
        VPofENG.addReport(seF);
        VPofENG.addReport(seG);
        VPofENG.addReport(analyst);
        seG.setCodeAccess(true);
        seG.checkInCode();
        seG.checkInCode();
        seD.setCodeAccess(true);
        seD.checkInCode();
        analyst.setCodeAccess(true);
        analyst.checkInCode();
        VPofENG.checkInCode();
        System.out.println(VPofENG.getTeamStatus());
        
        TechnicalLead AA = new TechnicalLead("Arsh");
        SoftwareEngineer dog = new SoftwareEngineer("Laadi");
 
        AA.checkInCode();
        AA.checkInCode();
        AA.checkInCode();
        AA.addReport(dog);
        dog.setCodeAccess(true);
        dog.checkInCode();
        System.out.println(AA.getTeamStatus());

        BusinessLead CFO = new BusinessLead("Amy Hood");
        BusinessLead CEO = new BusinessLead("Philip Price");
        Accountant actA = new Accountant("Niky");
        Accountant actB = new Accountant("Andrew");
        Accountant actC = new Accountant("Saul Goodman");
        CFO.addReport(actA, CTO);
        CFO.addReport(actB, VPofENG);
        CEO.addReport(actC, AA);
        System.out.println(CFO.getTeamStatus());
        System.out.println(CEO.getTeamStatus());
        System.out.println(actC.getTeamSupported());
        System.out.println(actB.getTeamSupported());
        System.out.println(actA.getTeamSupported());
        System.out.println(AA.getDirectReportsList());
        
    }
}