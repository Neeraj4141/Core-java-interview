package neeraj.exception;

public class TestTryCatchInsideFinally {

	public static void main(String[] args) {

		try {
			System.out.println("try");
		} catch (Exception e) {
			System.out.println("catch");
		} finally {

			try {
				System.out.println("inside finally try");
				int a = 10 / 0;
			} catch (ArithmeticException e) {
				System.out.println("inside finally catch");
			}

			System.out.println("finally end");
		}
	}
}
