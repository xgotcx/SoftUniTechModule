import java.util.Scanner;

public class main3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int money = Integer.parseInt(scanner.nextLine());
		double wight = Double.parseDouble(scanner.nextLine());
		double lenght = Double.parseDouble(scanner.nextLine());
		double side = Double.parseDouble(scanner.nextLine());
		double hight = Double.parseDouble(scanner.nextLine());
		double price = Double.parseDouble(scanner.nextLine());
		double moneyForWork = Double.parseDouble(scanner.nextLine());

		double areaFloor = wight * lenght;
		double triangle = side * hight / 2;
		double totalTiles = Math.ceil(areaFloor / triangle) + 5;
		double totalMoney = (totalTiles * price) + moneyForWork;



		if (totalMoney <= money){
			double result = money - totalMoney;
			System.out.printf("%.2f lv left." , result);

		}else{
			double result = totalMoney - money;
			System.out.println("You'll need " + result + " lv more.");

		}

	}
}
