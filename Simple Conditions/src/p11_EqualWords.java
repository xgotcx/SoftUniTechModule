import java.util.Scanner;

public class p11_EqualWords {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String word = scanner.nextLine().toLowerCase();
		String secondWord = scanner.nextLine().toLowerCase();

		if (word.equals(secondWord)){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
	}
}
