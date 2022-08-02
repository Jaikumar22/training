package task.abst;

import java.util.Scanner;

class Carrot extends Vegetables{
	public double price() {
		return 40;
	}public String color() {
		return "Orange";
	}public boolean nutrients() {
		return true;
	}public boolean fiber(){
		return true;
	}
	
	public void vegetabledata(Scanner mscanner) {
		Carrot c = new Carrot();
		String q = mscanner.nextLine();
		System.out.println(q+"Carrot: " + "Price:" + c.price() + "," + "Color:"  + c.color() + "," + 
		"Nutrients:" + c.nutrients() + "," + "Fiber:" + c.fiber()+".");
	}
	
	static void all() {
		Carrot c = new Carrot();
		System.out.println("Carrot: " + "Price:" + c.price() + "," + "Color:"  + c.color() + "," + 
		"Nutrients:" + c.nutrients() + "," + "Fiber:" + c.fiber()+".");
	}
}