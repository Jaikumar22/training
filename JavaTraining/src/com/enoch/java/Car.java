package com.enoch.java;

import java.awt.print.Book;

public class Car {
	public static void main(String[] args) {
		Book b1,b2;
		b1 = new Book();
		b2 = b1;
		if (b1 == b2)
			System.out.println("The two books are the same");
			else
			System.out.println("The two books are different");}
	
}
