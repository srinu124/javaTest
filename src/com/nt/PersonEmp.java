package com.nt;

import java.util.TreeSet;

public class PersonEmp {
	public static void main(String[] args) {
		TreeSet<Emp>t=new TreeSet<>(new CustomEmp());
		t.add(new Emp("srinu","nenavath",809614162L,23));
		t.add(new Emp("varun","ramav",8095466l,24));
		t.add(new Emp("raju","dumav",8096562l,23));
		t.add(new Emp("ganesh","nenavath",809614156l,22));
		t.add(new Emp("srinu","nenavath",8096141l,21));
		System.out.println(t);
		

	}

}
