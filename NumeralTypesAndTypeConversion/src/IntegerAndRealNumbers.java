import java.util.Scanner;

public class IntegerAndRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte years = Byte.parseByte(scanner.nextLine());
        int days = years * 365;
        int hours = days * 24;
        int minutes = hours * 60;

        System.out.printf("%d years = %d days = %d hours = %d minutes ", years , days , hours , minutes);
    }
}
