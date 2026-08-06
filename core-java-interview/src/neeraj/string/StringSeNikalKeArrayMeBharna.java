package neeraj.string;

import java.util.Arrays;

public class StringSeNikalKeArrayMeBharna {
	public static void main(String[] args) {
		String[] n = { "neeraj1233456" };
		String result = "";
		for (String str : n) {
			for (int i = 0; i < str.length(); i++) {
				if (Character.isDigit(str.charAt(i))) {
					result = result + str.charAt(i);

				}
			}

		}

		int arr[] = new int[result.length()];
		for (int i = 0; i < result.length(); i++) {
			arr[i] = Character.getNumericValue(result.charAt(i));
		}
		System.out.println(Arrays.toString(arr));
	}

}
