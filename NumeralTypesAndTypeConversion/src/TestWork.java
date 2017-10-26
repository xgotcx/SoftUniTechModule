import java.util.Scanner;

public class TestWork {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int count = 1;
        while(in.hasNext())
        {
            String s = in.nextLine();
            System.out.println(count + " " + s);
            count++;
        }
    }

}

