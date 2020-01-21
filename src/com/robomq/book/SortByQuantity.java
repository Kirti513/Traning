package com.robomq.book;

import java.util.Comparator;

public class SortByQuantity implements Comparator<Book>{

			
			public int compare(Book b1, Book b2) {
				
				int r=(int) ((int)b1.getQuantity()-b2.getQuantity());
				return r;
			}

		}


