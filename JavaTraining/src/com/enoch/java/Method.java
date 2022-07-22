package com.enoch.java;

public class Method {
	public static void main(String[] args) {
		power(3,4);
		System.out.println("loop ended");
	}
	private static void power(Integer a, Integer b) {
		System.out.println(a +  b);
		for (int i=10;i<=50;i=i+1) {
			if(i%2==0) {				
	        	System.out.print(i + "\t" + (i=i+2) + "\t" + (i=i+2));
	        	System.out.print("\n");
			}
	
		}
	}
}
	
