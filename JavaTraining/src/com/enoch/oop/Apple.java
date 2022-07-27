package com.enoch.oop;

public class Apple {
	double price;
	String color;
	String season;
	String type;

public void data() {
	Apple apple = new Apple();
	apple.price = 200;
	apple.color = "red";
	apple.season = "Autumn(Month:September-October)";
	apple.type = "import";
	System.out.println("Apple: " + "price:" + apple.price + "," +"Color:"+ apple.color + "," +"Season:"+ apple.season + "," +"Type:"+ apple.type+".");
	
}
}