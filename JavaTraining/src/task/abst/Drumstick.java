package task.abst;

import java.util.Scanner;

class Drumstick extends Vegetables{
	public double price() {
		return 15;
	}public String color() {
		return "Green";
	}public String season() {
		return "Summer";
	}public float minWeight(){
		return 2.05f;
	}public void vegetabledata(Scanner mscanner) {
		String q = mscanner.nextLine();
		Drumstick ds = new Drumstick();
		System.out.println(q+"Drumstrick: " + "price:" + ds.price() + "," +"Color:"+ ds.color() +
				"," +"Season:"+ ds.season() + "," +"Min weight:"+ ds.minWeight()+".");
	}
	
	static void all() {
		Drumstick ds = new Drumstick();
		System.out.println("Drumstrick: " + "price:" + ds.price() + "," +"Color:"+ ds.color() +
				"," +"Season:"+ ds.season() + "," +"Min weight:"+ ds.minWeight()+".");
	}
}