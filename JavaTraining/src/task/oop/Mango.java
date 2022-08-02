package task.oop;

import java.util.Scanner;

public class Mango extends Vegetables{
	
	private double price;
	private String colour;
	private boolean organic;
	private String taste;
	private String type;
	
	public void data(Scanner mScanner) {
		Mango mango = new Mango();
		mango.price=35;
		mango.colour="Yellow";
		mango.organic=true;
		mango.taste="Sweet";
		mango.type="Import";
		String fr = mScanner.nextLine();
		System.out.println(fr +  ":" +  "price:" + mango.price + "," + "Color:"+ mango.colour + "," +"Taste:"+ mango.taste + "," +"Organic:"+ mango.organic + "," +"Type:"+ mango.type + ".");
	
	}
	
}

	
