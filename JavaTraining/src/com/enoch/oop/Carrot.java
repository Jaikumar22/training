package com.enoch.oop;

public class Carrot {
	double price;
	String color;
	Boolean nutrients;
	Boolean fiber;
	public void data() {
		Carrot c = new Carrot();
		c.price = 50;
		c.color = "Orange";
		c.nutrients = true;
		c.fiber = true;
		System.out.println("Carrot: " + "Price:" + c.price + "," + "Color:"  + c.color + "," + "Nutrients:" + c.nutrients + "," + "Fiber:" + c.fiber+".");
		
	}
}
