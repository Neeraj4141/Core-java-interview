package neeraj.string;

public class MissingChar {
	public static void main(String[] args) {

		String n = "neerajmewada";

		for (char ch = 'a'; ch < 'z'; ch++) {

			int count = 0;

			for (int i = 0; i < n.length(); i++) {
				if (n.charAt(i) == ch) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println(ch);
			}
		}

	}
}
