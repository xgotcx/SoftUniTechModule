import java.util.Scanner;

public class working {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            sum = sum + (scanner.nextInt());
        }
        System.out.println(sum);


    }

}
