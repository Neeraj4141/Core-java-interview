package neeraj.javabasics;

public class Swaping {

	public static void main(String[] args) {

		int a = 10;
		int b = 5;
		int c = 0;

		// a = a + b;
		// b = a - b;
		// a = a - b;

		c = a;
		a = b;
		b = c;

		System.out.println(a);
		System.out.println(b);
	}

}
