package neeraj.javabasics;

public class FirstHigestNo {
	public static void main(String[] args) {

		int[] num = { 32, 83, 833, 92, 93, 2792, 348 };

		int highest = num[0];

		for (int i = 0; i < num.length; i++) {

			while (num[i] > highest) {
				highest = num[i];
			}
		}
		System.out.println(highest);
	}

}
