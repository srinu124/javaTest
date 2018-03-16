package com.nts;

import java.util.Comparator;

public class PersonEmp implements Comparator<Emp> {

	@Override
	public int compare(Emp e1, Emp e2) {
		int idcom=e1.getEno().compareTo(e2.getEno());
		int namecom=e1.getEname().compareTo(e2.getEname());
		int fname=e1.getEfirstname().compareTo(e2.getEfirstname());
		if(idcom<0) {
			return namecom;
			}
		    else if(namecom==0) {
	        	return fname;
	}
		     else {
		        return idcom;
	}
    
}
}
