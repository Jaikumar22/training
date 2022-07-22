package com.enoch.java;
import java.util.Random;
import java.awt.print.Printable;
import java.util.*;
public class random {
	public static void main(String args[]) {	
	Random random = new Random();	
	for (int i = 0; i < 10; i++) {
		int x = random.nextInt(100);	
		System.out.println("Randomly Generated Number:"+x);
			if(x%2==0) {
				System.out.println(""+x+" is Even Number");
			}
			else {
				System.out.println(""+x+" is Odd Number");
			}
		}
	}
}
