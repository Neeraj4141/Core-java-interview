package neeraj.javabasics;

public class SecondHighestNo {

	public static void main(String[] args) {

		int[] num = { 32, 32, 42, 52, 24, 24, 43, 53 };

		int first = 0;
		int second = 0;

		for (int i = 0; i < num.length; i++) {

			if (first < num[i]) {

				second = first;
				first = num[i];
			}

			if (second < num[i] && first > num[i]) {
				second = first;
			}

		}
		System.out.println(second);
	}

}
