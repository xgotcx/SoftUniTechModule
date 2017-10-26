import java.util.Scanner;

public class p02_RectangleOf_NxN_Stars {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < n; i++) {
			System.out.println(doMagic("*" , n));
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
