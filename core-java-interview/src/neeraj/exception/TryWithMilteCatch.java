package neeraj.exception;

public class TryWithMilteCatch {

	public static void main(String[] args) {

		int a = 10;
		String name = null;
		int c = a / 0;
		try {
			System.out.println("Divison = " + c);
			System.out.println(name.length());
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		} catch (NullPointerException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
