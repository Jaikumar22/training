package task.oop;

import java.util.Scanner;
public class Drumstick extends Vegetables{
	double price;
	String color;
	String season;
	float minweight;
	
	public void data(Scanner mScanner) {
		Drumstick ds = new Drumstick();
		ds.price = 15;
		ds.color = "Green";
		ds.season = "Summer";
		ds.minweight = 5.60f;
		String drumstrick =mScanner.nextLine();
		System.out.println(drumstrick +  ":" +   "price:" + ds.price + "," +"Color:"+ ds.color + "," +"Season:"+ ds.season + "," +"Min weight:"+ ds.minweight+".");
		
	}
}
