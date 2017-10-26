
import java.util.Scanner;

public class p05_FruitShop {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String fruit = scanner.nextLine().toLowerCase();
		String day = scanner.nextLine().toLowerCase();
		double quantity = Double.parseDouble(scanner.nextLine());
		double price = 0;

		switch (day) {
			case "monday":
			case "tuesday":
			case "wednesday":
			case "thursday":
			case "friday":

				switch (fruit) {
					case "banana":
						price = 2.50;
						break;
					case "apple":
						price = 1.20;
						break;
					case "orange":
						price = 0.85;
						break;
					case "grapefruit":
						price = 1.45;
						break;
					case "kiwi":
						price = 2.70;
						break;
					case "pineapple":
						price = 5.50;
						break;
					case "grapes":
						price = 3.85;
						break;
				}

				break;
			case "saturday":
			case "sunday":
				switch (fruit) {
					case "banana":
						price = 2.70;
						break;
					case "apple":
						price = 1.25;
						break;
					case "orange":
						price = 0.90;
						break;
					case "grapefruit":
						price = 1.60;
						break;
					case "kiwi":
						price = 3.00;
						break;
					case "pineapple":
						price = 5.60;
						break;
					case "grapes":
						price = 4.20;
						break;
				}
		}
		if (price > 0) {
			double total = price * quantity;
			System.out.printf("%.2f", total);
		} else {
			System.out.println("error");
		}

	}

}











