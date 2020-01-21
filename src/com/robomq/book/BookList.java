package com.robomq.book;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class BookList {

	
	public static void main(String[] args) {
		
		ArrayList<Book> books=new ArrayList<Book>();
		
		books.add(new Book(1,"The Very Hungry Caterpillar","Eric Carle","abcd",60));
		books.add(new Book(1,"The Shape of me and other stuff","Dr. Seuss","xyz",30));
		books.add(new Book(1,"The Story of Ferdinand","Munro Leaf","abd",20));
		books.add(new Book(1,"The  Caterpillar","Eric ","abc",50));
		books.add(new Book(1,"The  Hungry Caterpillar","Miss Kirti","xy",90));
		books.add(new Book(1,"The Hungry Man","Mr. harsh","pk",70));
		
		
		System.out.println(books);
		
		Iterator itr=books.iterator();
		while(itr.hasNext()) {
			Object ob=itr.next();
			Book bo=(Book)ob;
			System.out.println(bo.getName());
		}
		
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice for Sorting: (\n a - Sort by name,\n b-Sort by author, \n c-Sort by quantity");
		ch = sc.next().charAt(0);
		
		switch(ch) {
		case 'a':
			System.out.println("\nSorted By Name \n");
			SortByNam na=new SortByNam();
			books.sort(na);
			System.out.println(books);
			break;
		case 'b':
			System.out.println("\nSorted by author \n");
			SortByAuthor au=new SortByAuthor();
			books.sort(au);
			System.out.println(books);
			break;
		case 'c':
			System.out.println("\nSorted By Quantity \n");
			SortByQuantity qu=new SortByQuantity();
			books.sort(qu);
			System.out.println(books);
			break;
		default :
			System.out.println("Please enter right choice");
			break;
		}
	}
		
	}
	