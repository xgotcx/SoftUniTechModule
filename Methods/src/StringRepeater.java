import java.util.Scanner;

public class StringRepeater {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stringToRepeat = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        String result = RepeatString(stringToRepeat , count);
        System.out.println(result);
    }
    static String RepeatString(String str, int count)
    {
        String repeatedString = " ";

        for (int i = 0; i < count; i++)
        {
            repeatedString = repeatedString + str;
        }

        return repeatedString;
    }

}

