package neeraj.string;

public class CountOccuranceOfString {

	public static void main(String[] args) {

		String nr = "neeraj mewada";

		for (char ch = 'a'; ch <= 'z'; ch++) {
			int count = 0;
			for (int i = 0; i < nr.length(); i++) {
				if (nr.charAt(i) == ch) {
					count++;
				}
			}
			if (count > 0) {
				System.out.println(ch + " " + count);
			}
		}
	}

}
