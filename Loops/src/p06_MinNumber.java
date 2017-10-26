import java.util.Scanner;

public class p06_MinNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = Integer.parseInt(scanner.nextLine());
		int minNum = Integer.MAX_VALUE;

		for (int i = 0; i < num; i++) {
			int nexNum = Integer.parseInt(scanner.nextLine());
			if (nexNum < minNum){
				minNum = nexNum;
			}
		}
		System.out.println(minNum);
	}
}
