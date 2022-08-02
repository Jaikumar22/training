package task.oop;

import java.util.Scanner;

public class Apple extends Vegetables{
	double price;
	String color;
	String season;
	String type;

public void data(Scanner mScanner) {
	Apple apple = new Apple();
	apple.price = 200;
	apple.color = "red";
	apple.season = "Autumn(Month:September-October)";
	apple.type = "import";
	String apl = mScanner.nextLine();
	System.out.println(apl+   ":" +"price:" + apple.price + "," +"Color:"+ apple.color + "," +"Season:"+ apple.season + "," +"Type:"+ apple.type+".");
}
}