package task.abst;

import java.util.Scanner;

public class Items_Main {
	public static void main(String[] args) {
		
		Scanner mScanner = new Scanner(System.in);
		System.out.print("Input: ");
		String input = mScanner.nextLine();
		
		Mango Mangodetails = new Mango();
		Apple apple = new Apple();
		Carrot carrot = new Carrot();
		Drumstick drumstick = new Drumstick();
		
		
		
if (input.equals("mango")) {
	Mangodetails.fruitdata(mScanner);
	}else if (input.equals("apple")) {
		apple.fruitdata(mScanner);
		}else if (input.equals("carrot")) {
			carrot.vegetabledata(mScanner);
			}else if (input.equals("drumstrick")) {
				drumstick.vegetabledata(mScanner);
			}else {
				Drumstick.all();
				Carrot.all();
				Apple.all();
				Mango.all();
			}
	}

}	
