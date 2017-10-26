
public class Methods {
    public static void main(String[] args) {

        myDemo();

    }

    private static void myDemo() {
        printHeader();
        printBody();
        printFooter();
    }

    private static void printHeader() {
        System.out.println("CASH RECEIPT");
        System.out.println("------------------------------");
    }

    private static void printBody() {
        System.out.println("Charged to____________________");
        System.out.println("Received by___________________");
    }
    private static void printFooter() {
        System.out.println("------------------------------");
        System.out.println("\u00A9 SoftUni");
    }
}
