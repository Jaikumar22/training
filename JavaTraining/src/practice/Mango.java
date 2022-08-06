package practice;

class Mango extends Fruit {

	private static String taste;
	private static boolean organic;

	public static String getTaste() {
		return taste;
	}

	public static void setTaste(String taste) {
		Mango.taste = taste;
	}

	public static boolean isOrganic() {
		return organic;
	}

	public static void setOrganic(boolean organic) {
		Mango.organic = organic;
	}

	public static void fruitdata() {

		setTaste("sweet");
		setColor("yellow11");
		setOrganic(true);
		setTypeString("import");
		setPrice(35);

		System.out.println("Mango: " + "Price:" + Mango.getPrice() + "," + "Color:" + Mango.getColor() + "," + "Taste:"
				+ Mango.getTaste() + "," + "Organic:" + Mango.isOrganic() + "," + "Type:" + Mango.getTypeString()
				+ ".");

	}
}
