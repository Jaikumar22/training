package practice;

import java.util.Scanner;

public class Items_Main {
	public static void main(String[] args) {
		try (Scanner mScanner = new Scanner(System.in)) {
			System.out.print("Input: ");
			String input = mScanner.nextLine();

			if (input.equals("mango")) {
				Mango.fruitdata();
			} if (input.equals("apple")) {
				Apple.fruitdata();
			} else if (input.equals("carrot")) {
				Carrot.vegetabledata();
			} else if (input.equals("drumstick")) {
				Drumstick.vegetabledata();
			} else if (input.equals("all")) {
				Drumstick.vegetabledata();
				Carrot.vegetabledata();
				Apple.fruitdata();
				Mango.fruitdata();
			}
		}
	}

}
