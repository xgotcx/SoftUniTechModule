import java.util.Scanner;

public class p04_SumNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numbers = Integer.parseInt(scanner.nextLine());
		int sum = 0;

		for (int i = 0; i < numbers; i++) {
			int numbersForSum = Integer.parseInt(scanner.nextLine());
			sum = sum + numbersForSum;
		}
		System.out.println(sum);
	}
}
