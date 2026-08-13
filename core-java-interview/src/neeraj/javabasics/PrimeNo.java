package neeraj.javabasics;

public class PrimeNo {

	public static void main(String[] args) {

		for (int num = 2; num <= 100; num++) {
			boolean prime = false;

			for (int i = 2; i <= num / 2; i++) {

				if (num % i == 0) {
					prime = true;
				}
			}
			if (prime) {
				System.out.println(num + " Is Not A Prime No");

			} else {
				System.out.println(num + " Is A Prime No");

			}
		}
	}

}
