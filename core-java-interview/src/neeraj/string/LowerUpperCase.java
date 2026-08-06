package neeraj.string;

public class LowerUpperCase {

	public static void main(String[] args) {

		String n = "neeraj mewada";

		for (int i = 0; i < n.length(); i++) {

			if (i % 2 == 0) {
				String s = String.valueOf(n.charAt(i));
				System.out.print(s.toUpperCase());
			} else {
				String s2 = String.valueOf(n.charAt(i));
				System.out.print(s2.toLowerCase());
			}
		}
	}

}
