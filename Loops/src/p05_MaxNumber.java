import java.util.Scanner;

public class p05_MaxNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = Integer.parseInt(scanner.nextLine());
		int maxNum = Integer.MIN_VALUE;

		for (int i = 0; i < num; i++) {
			int nextNum = Integer.parseInt(scanner.nextLine());
			if (nextNum > maxNum){
				maxNum = nextNum;
			}
		}
		System.out.println(maxNum);
	}
}
