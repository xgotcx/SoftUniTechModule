import java.util.Scanner;

public class ArraysWithString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = new String[3];

                names [0] = "Zori";
                names [1] = "Aleks";
                names [2] = "Steli";

        for (int i = 0; i < names.length ; i++) {
            System.out.println(names[i]);
        }

    }
}
