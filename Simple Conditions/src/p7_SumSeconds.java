import java.util.Scanner;

public class p7_SumSeconds {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int s1 = Integer.parseInt(scanner.nextLine());
		int s2 = Integer.parseInt(scanner.nextLine());
		int s3 = Integer.parseInt(scanner.nextLine());

		int time = s1 + s2 + s3;
		int minutes = time / 60;
		int seconds = time % 60;

		System.out.printf("%d:%02d", minutes ,seconds);
	}
}
