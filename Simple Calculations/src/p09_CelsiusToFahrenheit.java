import java.util.Scanner;

public class p09_CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double c = Double.parseDouble(scanner.nextLine());
        double result = (c * 9 / 5) + 32;
        System.out.printf("%.2f" , result);

    }
}
