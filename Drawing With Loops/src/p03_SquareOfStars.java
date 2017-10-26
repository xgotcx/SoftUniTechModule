import java.util.Scanner;

public class p03_SquareOfStars {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = Integer.parseInt(scanner.nextLine());

		for (int i = 0; i < n ; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static String doMagic(String text, int repeatString) {
		String output = "";

		for (int i = 0; i < repeatString; i++) {
			output = output + text;
		}
		return output;
	}
}
