package neeraj.exception;

public class TestArithmeticException {

	public static void main(String[] args) {

		int i = 10;

		try {
			System.out.println(i / 0);
		} catch (ArithmeticException e) {
			System.out.println(
					e + " = 0 se divide karne ka valid mathematical result nahi hota, isliye exception aati hai");
		} finally {
			System.out.println("Exception aye ya naa aye me chalunga ");
		}
	}

}
