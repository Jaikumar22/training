package com.enoch.java;

public class forloop {
	public static void main(String[] agrs) {
		for (int i=10;i<=50;i=i+1) {
			if(i%2==0) {
				
	        	System.out.print(i + "\t" + (i=i+2) + "\t" + (i=i+2));
	        	System.out.print("\n");
	        	
			}
		}
	}
}