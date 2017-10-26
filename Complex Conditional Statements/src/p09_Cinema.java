import java.util.Scanner;

public class p09_Cinema {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String cinema = scanner.nextLine();
		int rows = Integer.parseInt(scanner.nextLine());
		int columbs = Integer.parseInt(scanner.nextLine());
		double total = 0;

		double premierePrice = 12.00;
		double normalPrice  = 7.50;
		double discountPrice = 5.00;

		if (cinema.equals("Premiere")){
			total = premierePrice * rows * columbs ;
		}else if (cinema.equals("Normal")){
			total = normalPrice * rows * columbs;
		}else if (cinema.equals("Discount")){
			total = discountPrice * rows * columbs;
		}
		System.out.printf("%.2f leva", total);
	}
}
