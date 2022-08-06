package practice;

public abstract class Fruit {
	private static int price;

	private static String color;

	private static String typeString;

	public static int getPrice() {
		return price;
	}

	public static void setPrice(int price) {
		Fruit.price = price;
	}

	public static String getColor() {
		return color;
	}

	public static void setColor(String color) {
		Fruit.color = color;
	}

	public static String getTypeString() {
		return typeString;
	}

	public static void setTypeString(String typeString) {
		Fruit.typeString = typeString;

	};

}
