package com.nts;

import java.util.TreeSet;

import com.nt.CustomComparator;
import com.nt.Customer;

public class EmpTest {
  public static void main(String[] args) {
	 TreeSet<Emp> t = new TreeSet(new PersonEmp());
	t.add(new Emp(101,"srinu","nenavath"));
	t.add(new Emp(102,"smith","raikoti"));
	t.add(new Emp(103,"charan","veenula"));
	t.add(new Emp(104,"prashanth","billa"));
	t.add(new Emp(105,"jaswa","gurram"));
	t.add(new Emp(101,"varun","billa"));
	t.add(new Emp(101,"srinu","nenavath"));
	for(Emp p:t) {
    System.out.println(p);		
	}
	
}
}
