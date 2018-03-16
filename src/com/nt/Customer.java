package com.nt;

public class Customer {

	private Long mdno;
	
	private Integer age;
	
	private String firstName;
	
	private String lastName;


	/*String firstname;
	String lastname;
	long mdno;
	int age;*/
	public Customer(Long  mdno,Integer age,String firstName,String lastName) {
		super();
		this.mdno= mdno;
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
		/*this.firstname=firstname;
		this.lastname=lastname;
		this.mdno=mdno;
		this.age=age;*/
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




	public String getFirstName() {
		return firstName;
	}




	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}




	public String getLastName() {
		return lastName;
	}




	public void setLastName(String lastName) {
		this.lastName = lastName;
	}




	@Override
	public String toString() {
		return "Customer [mdno=" + mdno + ", age=" + age + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	

}





