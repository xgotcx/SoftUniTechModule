import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] num = new int[4];

        num [0] = 1547;
        num [1] = 1347;
        num [2] = 1247;
        num [3] = 1587;

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}
