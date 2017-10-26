import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int n = Integer.parseInt(scanner.nextLine());
        PrintNumbers(10,60);
    }

    static void PrintNumbers(int first , int end) {
        for (int i = first; i <= end; i++) {
            System.out.print(i + " ");
        }
    }
}

