
public class p01_RectangleOf_10x10_Stars {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println(doMagic("*", 10));
		}
	}

	public static String doMagic(String text, int repeatString) {
		String output = "";

		for (int i = 0; i < repeatString; i++) {
			output = output + text;
		}
		return output;
	}
}



