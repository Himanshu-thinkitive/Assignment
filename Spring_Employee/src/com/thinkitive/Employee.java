package com.thinkitive;

public class Employee {
	
	private int empid;
	private String empname;
	private int basicsalary;
	private int pf;
	private int pt;
	private int hra;
	private int medical;
	private int groossSalary;
	private int netSalary;
	 
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int empid, String empname, int basicsalary, int medical) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.basicsalary = basicsalary;
		this.medical = medical;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getBasicsalary() {
		return basicsalary;
	}

	public void setBasicsalary(int basicsalary) {
		this.basicsalary = basicsalary;
	}

	public int getPf() {
		setPf();
		return pf;
	}

	public void setPf() {
		
		pf=(int) (0.12*basicsalary);
		
	}

	@Override
	public String toString() {
		return " [empid=" + empid + ", empname=" + empname + ", basicsalary=" + basicsalary + ", pf=" + getPf()
				+ ", pt=" + getPt() + ", hra=" + getHra() + ", medical=" + medical + ", groossSalary=" + getGroossSalary()
				+ ", netSalary=" + getNetSalary() + "]";
	}

	public int getPt() {
		setPt();
		return pt;
	}

	public void setPt() {
		pt=200;
		
	}

	public int getHra() {
		setHra();
		return hra;
	}

	public void setHra() {
		this.basicsalary=basicsalary;
		hra=(int)(basicsalary/2);
		
	}

	public int getMedical() {
		return medical;
	}

	public void setMedical(int medical) {
		this.medical = medical;
	}

	public int getGroossSalary() {
		setGroossSalary();
		return groossSalary;
	}

	public void setGroossSalary() {
		this.groossSalary=getBasicsalary()+hra+medical;
		
	}

	public int getNetSalary() {
		setNetSalary();
		return netSalary;
	}

	public void setNetSalary() {
		netSalary=getBasicsalary()-pf-pt;
		this.netSalary = netSalary;
	}
	
	
	

}
