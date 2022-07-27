package com.enoch.oop;

public class Drumstick {
	double price;
	String color;
	String season;
	float minweight;
	
	public void data() {
		Drumstick ds = new Drumstick();
		ds.price = 15;
		ds.color = "Green";
		ds.season = "Summer";
		ds.minweight = 5.60f;
		System.out.println("Drumstrick: " + "price:" + ds.price + "," +"Color:"+ ds.color + "," +"Season:"+ ds.season + "," +"Min weight:"+ ds.minweight+".");
		
	}
}
