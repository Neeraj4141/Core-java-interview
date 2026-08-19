package neeraj.javabasics;

public class CountNoOfInt {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 2, 4, 5 };
		int num = 6;
		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				temp = num;
			}
		}
		System.out.println(temp);
	}

}
