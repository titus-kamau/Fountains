package minilab;

import java.util.Random;

public class Serial_no_Generator {
	public Serial_no_Generator() {
		String serial = "";
		int[] num = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		String[] alpha = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
				"k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
				"w", "x", "y", "z" };
		Random radint = new Random();

		for (int i = 0; i < 3; i++) {
			serial += num[radint.nextInt(num.length)];
			serial += alpha[radint.nextInt(alpha.length)];
		}
		System.out.println(serial);
	}

	public static void main(String[] args) {
		new Serial_no_Generator();
	}
}
