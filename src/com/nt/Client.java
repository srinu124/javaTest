package com.nt;

import java.util.TreeSet;

public class Client {

	public static void main(String[] args) {

		TreeSet<Customer> ts = new TreeSet(new CustomComparator());
	    ts.add(new Customer(8096141623l,25, "srinu", "nenavath"));
		ts.add(new Customer(8096141623L,26, "bhanu", "ramavath"));
		ts.add(new Customer(854654664l,26, "vijay", "rathod"));
		ts.add(new Customer(7842680412l,36, "Shirisha", "vennala"));
		ts.add(new Customer(9000377163l,25, "balu", "maloth"));
		ts.add(new Customer(7965464646l,20, "Sonalika", "dumava"));
		ts.add(new Customer(7182564566l,26, "bhanu", "ramavath"));
		//ts.add(new Customer(7182564566l,26, "bhanu", "ramavath"));
		
		
		/*TreeSet t<Customer>=new TreeSet<>(new CustomComparator());
		t.add(new Customer("srinu","nenavath",8096141623l,23));
		t.add(new Customer("raju","mud",6678424545l,22));
		t.add(new Customer("srinu","rama",80961645l,23));
		t.add(new Customer("gani","nen",8096141585l,20));
		t.add(new Customer("srinu","nenavath",8096141623l,23));
		*/
		for(Customer c:ts)
			System.out.println(c);


	}

}
 


