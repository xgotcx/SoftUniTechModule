import java.util.Scanner;

public class p8_MetricConverter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double num = Double.parseDouble(scanner.nextLine());
		String inMeter = scanner.nextLine();
		String outMeter = scanner.nextLine();

		if (inMeter.equals("mm")) {
			num /= 1000;
		} else if (inMeter.equals("cm")) {
			num /= 100;
		} else if (inMeter.equals("mi")) {
			num /= 0.000621371192;
		} else if (inMeter.equals("in")) {
			num /= 39.3700787;
		} else if (inMeter.equals("km")) {
			num /= 0.001;
		} else if (inMeter.equals("ft")) {
			num /= 3.2808399;
		} else if (inMeter.equals("yd")) {
			num /= 1.0936133;
		}
		if (outMeter.equals("mm")) {
			num *= 1000;
		} else if (outMeter.equals("cm")) {
			num *= 100;
		} else if (outMeter.equals("mi")) {
			num *= 0.000621371192;
		} else if (outMeter.equals("in")) {
			num *= 39.3700787;
		} else if (outMeter.equals("km")) {
			num *= 0.001;
		} else if (outMeter.equals("ft")) {
			num *= 3.2808399;
		} else if (outMeter.equals("yd")) {
			num *= 1.0936133;
		}
		System.out.println(num);
	}
}
