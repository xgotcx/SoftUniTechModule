import java.util.Scanner;

public class p13_AreaOfFigures {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String figure = scanner.nextLine();

		if (figure.equals("square")){
			double a = Double.parseDouble(scanner.nextLine());
			double area = a * a;
			System.out.println(Math.abs(area));

		}else if (figure.equals("rectangle")){
			double a = Double.parseDouble(scanner.nextLine());
			double h = Double.parseDouble(scanner.nextLine());
			double area = a * h;
			System.out.println(Math.abs(area));

		}else if (figure.equals("circle")){
			double r = Double.parseDouble(scanner.nextLine());
			double result = Math.PI * r * r;
			String value = String.format("%1$.3f",result);
			System.out.printf(value);

		}else if (figure.equals("triangle")){
			double a = Double.parseDouble(scanner.nextLine());
			double h = Double.parseDouble(scanner.nextLine());
			double result = a * h / 2;
			System.out.println(result);
		}
	}
}
