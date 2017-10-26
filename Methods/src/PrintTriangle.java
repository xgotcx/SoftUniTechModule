import java.util.Scanner;

public class PrintTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        PrintTriangle(n);
    }

    static void PrintTriangle(int n) {
        for (int i = 1; i <= n ; i++) {
            PrintLine(i);
        }
        for (int i = n - 1; i >= 1 ; i--) {
            PrintLine(i);
        }
    }

    static void PrintLine(int size) {
        for (int i = 1; i <= size; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
