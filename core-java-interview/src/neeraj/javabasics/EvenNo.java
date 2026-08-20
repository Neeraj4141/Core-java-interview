package neeraj.javabasics;

public class EvenNo {

	public static void main(String[] args) {

		int i = 13;

		if (i % 2 == 0) {
			System.out.println(i + " This is Even No");
		} else {
			System.out.println(i + " This Is Not Even No");
		}

		for (int i2 = 2; i2 <= 100; i2++) {
			if (i2 % 2 == 0) {
				System.out.println(i2 + " this is even no ");
			} else {
				System.out.println(i2 + " this is Odd no ");
			}
		}
	}
}
