import java.util.Scanner;

public class CirclePerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r = Double.parseDouble(scanner.nextLine());
        double result = 2 * Math.PI * r;
        System.out.printf("%.12f" , result);
    }
}
