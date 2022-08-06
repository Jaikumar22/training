package practice;

class Apple extends Fruit {

	private static String season;

	public static String getSeason() {
		return season;
	}

	public static void setSeason(String season) {
		Apple.season = season;
	}

	public static void fruitdata() {
		setPrice(105);
		setColor("Red");
		setSeason("Summer");
		setTypeString("import");

		System.out.println("Apple: " + "price:" + Apple.getPrice() + "," + "Color:" + Apple.getColor() + "," + "Season:"
				+ Apple.getSeason() + "," + "Type:" + Apple.getTypeString() + ".");

	}

}
