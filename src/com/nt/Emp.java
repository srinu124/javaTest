package com.nt;

public class Emp {
	String firstname;
	String lastname;
	Long mdno;
	Integer age;
	
	Emp(String firstname,String lastname,Long mdno,int age){
		this.firstname=firstname;
		this.lastname=lastname;
		this.mdno=mdno;
		this.age=age;
		
		
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Long getMdno() {
		return mdno;
	}
	public void setMdno(Long mdno) {
		this.mdno = mdno;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "Customer [firsname=" + firstname + ", lastname=" + lastname + ", mdno=" + mdno + ", age=" + age + "]";
	  
	}

}
