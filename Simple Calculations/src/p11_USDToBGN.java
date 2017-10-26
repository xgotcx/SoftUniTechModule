import java.util.Scanner;

public class p11_USDToBGN {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double USD = 1.79549;
        double BGN = Double.parseDouble(scanner.nextLine());

        double result = BGN * USD;
        System.out.printf("%.2f" , result);
    }
}
