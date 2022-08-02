package task.oop;

import java.util.Scanner;
public class Carrot extends Vegetables{
	double price;
	String color;
	Boolean nutrients;
	Boolean fiber;
	public void data(Scanner mScanner) {
		Carrot c = new Carrot();
		c.price = 50;
		c.color = "Orange";
		c.nutrients = true;
		c.fiber = true;
		String carrrot = mScanner.nextLine();
		System.out.println(carrrot +  ":" + "Price:" + c.price + "," + "Color:"  + c.color + "," + "Nutrients:" + c.nutrients + "," + "Fiber:" + c.fiber+".");
		
	}
}
