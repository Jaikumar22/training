package task.oop;
import java.util.Scanner;
public class Vegetables{
	public static void main(String[] args) {
		Scanner mScanner = new Scanner(System.in);
		System.out.print("Input: ");
		String input = mScanner.nextLine();
		Mango mangodetails = new Mango();
//		mangodetails.data(mScanner);
		Apple appledetails = new Apple();
//		appledetails.data(mScanner);
		Carrot carrot = new Carrot();
//		carrot.data(mScanner);
		Drumstick drumstrick = new Drumstick();
//		drumstrick.data(mScanner);
		if (input.equals("mango")) {
				mangodetails.data(mScanner);
		}else if (input.equals("apple")) {
					appledetails.data(mScanner);
				}else if (input.equals("carrot")) {
						carrot.data(mScanner);
					}else if (input.equals("drumstrick")) {
							drumstrick.data(mScanner);
						}
		
	
		
		
	}	
}

