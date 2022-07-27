package com.enoch.oop;
public class Mango extends Vegetables{
	public static int java;
	double price = 35 ;
	String colour = "Yellow";
	String taste = "Sweet";
	Boolean organic = true;
	String type = "import";
	public void data() {
		Mango Mangodetails = new Mango();
		Mangodetails.price=35;
		Mangodetails.colour="Yellow";
		Mangodetails.organic=true;
		Mangodetails.taste="Sweet";
		Mangodetails.type="Import";
		System.out.println("Mango: " +  "price:" + Mangodetails.price + "," + "Color:"+ Mangodetails.colour + "," +"Taste:"+ Mangodetails.taste + "," +"Organic:"+ Mangodetails.organic + "," +"Type:"+ Mangodetails.type + ".");
	}
}

	
