import java.util.Scanner;

public class p9_PasswordGuess {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String password = scanner.nextLine();

		if (password.equals("qwerty")) {
			System.out.println("Wrong password!");
		} else if (password.equals("s3cr3t!P@ssw0rd")) {
			System.out.println("Welcome");
		} else if (password.equals("s3cr3t!p@ss")) {
			System.out.println("Wrong password!");
		}
	}
}