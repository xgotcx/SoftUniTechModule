import java.util.Scanner;

public class p10_RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rad = Double.parseDouble(scanner.nextLine());
        double dag = Math.round(rad * 180 / Math.PI);

        System.out.println(dag);
    }
}
