import java.util.Scanner;

public class p02_SmallShop {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String product = scanner.nextLine().toLowerCase();
		String town = scanner.nextLine().toLowerCase();
		double quantity = Double.parseDouble(scanner.nextLine());
		double price = 0;

		if (town.equals("sofia")) {
			if (product.equals("coffee")) {
				price = quantity * 0.50;
			} else if (product.equals("water")) {
				price = quantity * 0.80;
			} else if (product.equals("beer")) {
				price = quantity * 1.20;
			} else if (product.equals("sweets")) {
				price = quantity * 1.45;
			} else if (product.equals("peanuts")) {
				price = quantity * 1.60;
			}
		} else if (town.equals("plovdiv")) {
			if (product.equals("coffee")) {
				price = quantity * 0.40;
			} else if (product.equals("water")) {
				price = quantity * 0.70;
			} else if (product.equals("beer")) {
				price = quantity * 1.15;
			} else if (product.equals("sweets")) {
				price = quantity * 1.30;
			} else if (product.equals("peanuts")) {
				price = quantity * 1.50;
			}
		} else if (town.equals("varna")) {
			if (product.equals("coffee")) {
				price = quantity * 0.45;
			} else if (product.equals("water")) {
				price = quantity * 0.70;
			} else if (product.equals("beer")) {
				price = quantity * 1.10;
			} else if (product.equals("sweets")) {
				price = quantity * 1.35;
			} else if (product.equals("peanuts")) {
				price = quantity * 1.55;
			}

		}
		System.out.println(price);
	}
}
