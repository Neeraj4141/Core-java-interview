package neeraj.string;

public class CountOccuranceOfaChar {
	public static void main(String[] args) {

		String n = "neeraj mewada";

		char ch = 'a';

		int count = 0;

		for (int i = 0; i < n.length(); i++) {
			if (n.charAt(i) == ch) {
				count++;
			}
		}
		if (count > 0) {
			System.out.println(ch + " = " + count);
		}
	}

}
