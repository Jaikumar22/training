package practice;

public abstract class Vegetables {

	private static int price;

	private static String color;

	private static String season;

	public static int getPrice() {
		return price;
	}

	public static void setPrice(int price) {
		Vegetables.price = price;
	}

	public static String getColor() {
		return color;
	}

	public static void setColor(String color) {
		Vegetables.color = color;
	}

	public static String getSeason() {
		return season;
	}

	public static void setSeason(String season) {
		Vegetables.season = season;
	}
}
