import java.util.Scanner;

public class p6_BonusScore {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = Integer.parseInt(scanner.nextLine());
		double bonusScore = 0;

		if (num <= 100){
			bonusScore += 5;
		}else if (num <= 1000){
			bonusScore = num * 0.2;
		}else if (num > 1000){
			bonusScore = num * 0.1;
		}
		if (num % 2 == 0){
			bonusScore += 1;
		}else if (num % 10 == 5){
			bonusScore += 2;
		}
		System.out.println(bonusScore);
		System.out.println(bonusScore + num);
	}
}
