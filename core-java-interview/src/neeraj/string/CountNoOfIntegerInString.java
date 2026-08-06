package neeraj.string;

public class CountNoOfIntegerInString {

	public static void main(String[] args) {
		String n = "Neeraj26112344";

		int count = 0;

		for (int i = 0; i < n.length(); i++) {
			if (Character.isDigit(n.charAt(i))) {
				count++;
			}

		}
		if (count > 0) {
			System.out.println(count);
		}
	}

}
