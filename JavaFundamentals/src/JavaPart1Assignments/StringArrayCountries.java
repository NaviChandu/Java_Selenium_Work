package JavaPart1Assignments;

public class StringArrayCountries {
	public static void main(String[] args) {

		// String country [] = new String[10];
		String country[] = { "BELGIUM", "FRANCE", "GERMANY", "INDIA", "ITALY", "JAPAN", "MEXICO", "NETHERLANDS",
				"SPAIN", "UNITED STATES" };

		for (int i = 0; i < country.length; i++) {
			if (country[i].equals("BELGIUM")) {
				System.out.println(country[i] + " capital is " + "BRUSSELS");
			} else if (country[i].equals("FRANCE")) {
				System.out.println(country[i] + " capital is " + "PARIS");
			} else if (country[i].equals("GERMANY")) {
				System.out.println(country[i] + "capital is " + "BERLIN");
			} else if (country[i].equals("INDIA")) {
				System.out.println(country[i] + " capital is " + "NEW DELHI");
			} else if (country[i].equals("ITALY")) {
				System.out.println(country[i] + " capital is " + "ROME");
			} else if (country[i].equals("JAPAN")) {
				System.out.println(country[i] + " capital is " + "TOKYO");
			} else if (country[i].equals("MEXICO")) {
				System.out.println(country[i] + " capital is " + "MEXICO CITY");
			} else if (country[i].equals("NETHERLANDS")) {
				System.out.println(country[i] + " capital is " + "AMSTERDAM");
			} else if (country[i].equals("SPAIN")) {
				System.out.println(country[i] + " capital is " + "MADRID");
			} else if (country[i].equals("UNITED STATES")) {
				System.out.println(country[i] + " capital is " + "WASHINGTON, D.C.");
			} else {
				System.out.println(country[i] + " is not listed");
			}
		}
	}

}
