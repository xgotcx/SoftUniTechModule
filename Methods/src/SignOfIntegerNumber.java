import java.util.Scanner;

public class SignOfIntegerNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        SignOfIntegerNumber(n);
    }
    public static void SignOfIntegerNumber(int n) {

        if (n > 0){
            System.out.println("The number " + n + " is positive.");
        }else if (n < 0){
            System.out.println("The number " + n + " is negative.");
        }else{
            System.out.println("The number " + n + " is zero.");
        }
    }
}
