import java.util.Scanner;

public class main2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double money = Double.parseDouble(scanner.nextLine());
		String season = scanner.nextLine();

		if (money <= 100) {
			if (season.equals("summer")) {
				double total = money * 0.3;
				System.out.println("Somewhere in Bulgaria");
				System.out.printf("Camp - %.2f", total);

			} else if (season.equals("winter")) {
				double total = money * 0.7;
				System.out.println("Somewhere in Bulgaria");
				System.out.printf("Hotel - %.2f", total);

			}
		} else if (money <= 1000) {
			if (season.equals("summer")) {
				double total = money * 0.4;
				System.out.println("Somewhere in Balkans");
				System.out.printf("Camp - %.2f", total);

			} else if (season.equals("winter")) {
				double total = money * 0.8;
				System.out.println("Somewhere in Balkans");
				System.out.printf("Hotel - %.2f", total);
			}
		} else if (money > 1000) {
			double total = money * 0.9;
			System.out.println("Somewhere in Europe");
			System.out.printf("Hotel - %.2f", total);
		}
	}
}
