import java.util.Scanner;

public class BlankReceipt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Blank();
    }

    private static void Blank() {
        Header();
        Body();
        Footer();
    }

    private static void Header(){
        System.out.println("CASH RECEIPT");
        System.out.println("------------------------------");
    }
    private static void Body(){
        System.out.println("Charged to____________________");
        System.out.println("Received by___________________");
    }
    private static void Footer(){
        System.out.println("------------------------------");
        System.out.println("\u00A9 SoftUni");
    }

}



