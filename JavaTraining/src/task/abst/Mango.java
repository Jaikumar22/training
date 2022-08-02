package task.abst;

import java.util.Scanner;

class Mango extends Fruit{
	public double price() {
		return 35;
	}public String color() {
		return "Yellow";
	}public String taste() {
		return "Sweet";
	}public boolean organic() {
		return true;
	}public String type() {
		return "Import";
	}public void fruitdata(Scanner mscanner) {
		Mango Mangodetails = new Mango();
		String q = mscanner.nextLine();
		System.out.println(q+ "Mango: " +Mangodetails.price() + "," + "Color:" + Mangodetails.color() + "," +"Taste:"+ Mangodetails.taste() + "," + "Organic:"+ Mangodetails.organic() + "," +"Type:"+ Mangodetails.type() + ".");
	}
	
	static void all() {
		Mango Mangodetails = new Mango();
		System.out.println("Mango: " + Mangodetails.price() + "," + "Color:" + Mangodetails.color() + "," +"Taste:"+ Mangodetails.taste() + "," + "Organic:"+ Mangodetails.organic() + "," +"Type:"+ Mangodetails.type() + ".");
	}
	
}
