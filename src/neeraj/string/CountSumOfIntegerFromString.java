package neeraj.string;

public class CountSumOfIntegerFromString {

	public static void main(String[] args) {
		String n = "neeraj1234";
		int sum = 0;
		for (int i = 0; i < n.length(); i++) {
			if (Character.isDigit(n.charAt(i))) {
				sum = sum + Character.getNumericValue(n.charAt(i));
			}
		}
		System.out.println(sum);
	}
}