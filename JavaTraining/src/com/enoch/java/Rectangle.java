package com.enoch.java;

public class Rectangle {

	int length, breath;
	int perimeter=12;
	
	Rectangle(){
		System.out.println("test");
	}
	
	
	  Rectangle(int a, int b){ length = a; breath = b; perimeter = length*breath; }
	  
	  Rectangle(int a) { length = a;  perimeter = length*breath; }
	 
	
	
	public static void main(String[] args) {
		
		Rectangle arect = new Rectangle(3);
		//arect.length = 3;
		//arect.breath = 5;
		//arect.perimeter = arect.breath * arect.breath;
		System.out.println(arect.length);
		System.out.println(arect.breath);
		arect.length = 10;
		System.out.println(arect.perimeter);
		System.out.println(arect.length);
		System.out.println("program successfully finished");
		
	}
	
	
	
}
