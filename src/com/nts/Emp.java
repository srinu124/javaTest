package com.nts;

public class Emp {
	Integer eno;
	String name;
	String elastname;
	
	public Emp(Integer eno,String name,String elastname){
		super();
          this.eno=eno;
          this.name=name;
          this.elastname=elastname;
        
	}

	public Integer getEno() {
		return eno;
	}

	public void setEno(Integer eno) {
		this.eno = eno;
	}

	public String getEname() {
		return name;
	}

	public void setEname(String ename) {
		this.name = ename;
	}

	public String getEfirstname() {
		return name;
	}

	public void setEfirstname(String efirstname) {
		this.name = efirstname;
	}

	
	@Override
	public String toString() {
		return "Customer [eno=" + eno + ",  ename=" + name + ", elastame=" + elastname + "]";
	}
	
}
