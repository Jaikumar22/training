package practice;

class Drumstick extends Vegetables {

	public static String season;

	public static float minweight;

	public static String getSeason() {
		return season;
	}

	public static void setSeason(String season) {
		Drumstick.season = season;
	}

	public static float getMinweight() {
		return minweight;
	}

	public static void setMinweight(float minweight) {
		Drumstick.minweight = minweight;
	}

	public static void vegetabledata() {
		setPrice(15);
		setColor("Green");
		setSeason("Summer");
		setMinweight(2.06f);
		System.out.println("Drumstrick: " + "price:" + Drumstick.getPrice() + "," + "Color:" + Drumstick.getColor()
				+ "," + "Season:" + Drumstick.getSeason() + "," + "Min Weight:" + Drumstick.getMinweight() + ".");

	}

}