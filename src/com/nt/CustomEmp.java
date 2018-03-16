package com.nt;

import java.util.Comparator;

public class CustomEmp implements Comparator<Emp> {

	@Override
	public int compare(Emp e1,Emp e2) {
		int firstnamecom=e1.getFirstname().compareTo(e2.getFirstname());
		int lastnamecom=e1.getLastname().compareTo(e2.getLastname());
		int mdnocom=e1.getMdno().compareTo(e2.getMdno());
		int agecom=e1.getAge().compareTo(e2.getAge());
		//int actypecom=e1.getActype().compareTo(e2.getActype());
		
		
		
if(firstnamecom<0) {
			
			if(lastnamecom==0) {
				
				if(mdnocom==0) {
					
					if(agecom==0) {
						//if( actypecom==0) {
							
						
						return -1;
					}else if(lastnamecom<0) {
						return -1;
					}else if(lastnamecom>0) {
						return 1;
					}
					
					return -1;
				}else if(firstnamecom<0) {
					
					return -1;
				}else if(firstnamecom>0){
					return 1;
				}
				
				return -1;
			}
			
			return -1;
		}else if(firstnamecom>0) {
			
			if(lastnamecom==0) {
				
				if(mdnocom==0) {
					
					if(agecom==0) {
						
						return 1;
					/*}else if(actypecom<0) {
						return -1;
					}else if(actypecom>0) {
						return 1;*/
					}
					
					return 1;
				}else if(firstnamecom<0) {
					
					return -1;
				}else if(firstnamecom>0) {
					return 1;
				}
				
				return 1;
			}
			
			return 1;
		}else {
			
			return -1;
		}
		
	




		//return 0;
	}

}
