package com.robomq.map;

import java.util.Set;
import java.util.TreeMap;

public class AuthorTreeMap {

	public static void main(String[] args) {

		TreeMap<String,Author> authors=new TreeMap<String,Author>();
		
		authors.put("Raavan- Enemy of Aryavarta", new Author (1,"Amish Tripathi","Pratap Nagar"));
		authors.put("City Of Girls ", new Author (1,"Elizabeth Gilbert","Malviya Nagar"));
		authors.put("Gun Island ", new Author (1,"Amitav Ghosh","Mansarover"));
		authors.put("The Anarchy", new Author (1,"Amish Tripathi","Pratap Nagar"));
		authors.put("The Apology", new Author (1,"Eve Ensler","Jagatpura"));
		
//		System.out.println(authors);
		
		Set<String> keys = authors.keySet();
		for(String key: keys) {
			System.out.println(" "+key+" Written by "+authors.get(key).getName()+" Residing at "+authors.get(key).getAddress());
		}


	}

}
