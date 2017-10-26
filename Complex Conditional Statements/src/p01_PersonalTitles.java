import java.util.Scanner;

public class p01_PersonalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double age = Double.parseDouble(scanner.nextLine());
        String gander = scanner.nextLine();

        if (age < 16) {
            if (gander.equals("m")) {
                System.out.println("Master");
            } else if (gander.equals("f")) {
                System.out.println("Miss");
            }
        } else {
            if (age >= 16) {
                if (gander.equals("m")) {
                    System.out.println("Mr.");
                } else if (gander.equals("f")) {
                    System.out.println("Ms.");
                }
            }
        }
    }
}