package task.abst;

import java.util.Scanner;

class Apple extends Fruit{
	public double price() {
		return 105;
	}public String color() {
		return "Red";
	}public String type() {
		return "Import";
	}public String season() {
		return "Autum";
	}
	
	public void fruitdata(Scanner mscanner) {
		Apple apple = new Apple();
		String q = mscanner.nextLine();
		System.out.println(q+"Apple: " + "price:" + apple.price() + "," + "Color:"+ apple.color() + "," +"Season:"+ apple.season() + "," + "Type:"+ apple.type()+".");
	}
	
	static void all() {
		Apple apple = new Apple();
		System.out.println("Apple: " + "price:" + apple.price() + "," + "Color:"+ apple.color() + "," +"Season:"+ apple.season() + "," + "Type:"+ apple.type()+".");
	}
}
