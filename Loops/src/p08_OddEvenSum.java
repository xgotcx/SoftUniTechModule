import java.util.Scanner;

public class p08_OddEvenSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int firstNum = Integer.parseInt(scanner.nextLine());
		int evenSum = 0;
		int oddSum = 0;

		for (int i = 0; i < firstNum; i++) {
			int num = Integer.parseInt(scanner.nextLine());
			if (i % 2 == 0){
				evenSum += num;
			}else{
				oddSum += num;
			}
		}
		if (evenSum == oddSum){
			System.out.println("Yes");
			System.out.println("Sum = " + evenSum);

		}else{
			System.out.println("No");
			System.out.println("Diff = " + Math.abs(evenSum - oddSum));
		}

	}
}

