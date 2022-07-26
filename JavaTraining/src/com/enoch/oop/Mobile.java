package com.enoch.oop;

public class Mobile {
	int rating() {
		return 0;
	}
}
class nokia extends Mobile{
	int rating() {
		return 50;
	}
}
class apple extends Mobile{
	int rating() {
		return 40;
	}
}
class RatingMobile{
	public static void main(String[] args) {
		Mobile a;
		a = new nokia();
		System.out.println(a.rating());
		a = new apple();
		System.out.println(a.rating());
	}
	
}