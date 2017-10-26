import java.util.Scanner;

public class demoMain {
    private static Scanner keyboard = new Scanner(System.in);
    private static boolean flag = true;
    private static int B;
    private static int H;

    static {
        B = keyboard.nextInt();
        H = keyboard.nextInt();
        if (B <= 0 || H <= 0) {
            System.out.print("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.println(area);
        }
    }
}
