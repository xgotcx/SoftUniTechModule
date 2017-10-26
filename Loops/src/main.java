import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int money = Integer.parseInt(scanner.nextLine());
		double wight = Double.parseDouble(scanner.nextLine());
		double lenght = Double.parseDouble(scanner.nextLine());
		double side = Double.parseDouble(scanner.nextLine());
		double hight = Double.parseDouble(scanner.nextLine());
		double price = Double.parseDouble(scanner.nextLine());
		double moneyForWork = Double.parseDouble(scanner.nextLine());

		double area = ((wight * lenght) / (side * hight / 2)) + 5;
		double totalMoney = (area * price) + moneyForWork;
		double total = money - totalMoney;

		if (totalMoney < money) {
			System.out.printf(total + " lv left");
		}
	}
}





