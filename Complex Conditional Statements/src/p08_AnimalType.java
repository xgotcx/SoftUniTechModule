import java.util.Scanner;

public class p08_AnimalType {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String animal = scanner.nextLine();

		switch (animal) {
			case "dog":
				System.out.println("mammal");
				break;
			case "crocodile":
				System.out.println("reptile");
				break;
			case "tortoise":
				System.out.println("reptile");
				break;
			case "snake ":
				System.out.println("reptile");
				break;
			case "snake":
				System.out.println("reptile");
				break;
			case "cat":
				System.out.println("unknown");
				break;
		}

	}
}
