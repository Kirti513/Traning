package com.robomq.map;

import java.util.TreeSet;

public class ElectionTreeSet {
	
	public static void main(String[] args) {
		
		TreeSet<ElectionParties> elp=new TreeSet<ElectionParties>();
		
		elp.add(new ElectionParties(1,"Simran","31/01/2020","Kota","Vigyan Nagar","06/02/2020"));
		elp.add(new ElectionParties(3,"Kirti","28/01/2020","Jaipur","Pratap Nagar","05/02/2020"));
		elp.add(new ElectionParties(1,"Noopur","27/01/2020","Durgapura","Malviya Nagar","08/02/2020"));
		elp.add(new ElectionParties(1,"Simran","23/01/2020","Nagar","pol Nagar","07/02/2020"));
		elp.add(new ElectionParties(1,"Simran","31/01/2020","Kota","Vigyan Nagar","06/02/2020"));
		
		
		System.out.println(elp);
	}

}
