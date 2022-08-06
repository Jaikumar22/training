package practice;

class Carrot extends Vegetables {

	private static boolean nutrients;

	public static boolean isNutrients() {
		return nutrients;
	}

	public static void setNutrients(boolean nutrients) {
		Carrot.nutrients = nutrients;
	}

	private static boolean fiber;

	public static boolean isFiber() {
		return fiber;
	}

	public static void setFiber(boolean fiber) {
		Carrot.fiber = fiber;
	}

	public static void vegetabledata() {
		setPrice(56);
		setColor("orange");
		setNutrients(true);
		setFiber(true);
		System.out.println("Carrot: " + "Price:" + Carrot.getPrice() + "," + "Color:" + Carrot.getColor() + ","
				+ "Nutrients:" + Carrot.isNutrients() + "," + "Fiber:" + Carrot.isFiber());
	}
}