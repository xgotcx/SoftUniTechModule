import java.util.Scanner;

public class p07_LeftAndRightSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = Integer.parseInt(scanner.nextLine());

		int leftSum = 0;
		for (int i = 0; i < num; i++) {
			int number = Integer.parseInt(scanner.nextLine());
			leftSum += number;
		}
		int rightSum = 0;
		for (int i = 0; i < num; i++) {
			int number = Integer.parseInt(scanner.nextLine());
			rightSum += number;
		}
		if (leftSum == rightSum){
			System.out.println("Yes, sum = " + leftSum);
		}else{
			System.out.println("No, diff = " + Math.abs(leftSum - rightSum));
		}

	}
}
