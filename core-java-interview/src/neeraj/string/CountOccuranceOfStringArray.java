package neeraj.string;

public class CountOccuranceOfStringArray {
	public static void main(String[] args) {
		String[] str = { "core", "java" };

		for (char ch = 'a'; ch <= 'z'; ch++) {

			for (String n : str) {
				int count = 0;
				for (int i = 0; i < n.length(); i++) {
					if (ch == n.charAt(i)) {
						count++;
					}

				}
				if (count > 0) {
					System.out.println(ch + "=" + count);
				}
			}
		}
	}
}
