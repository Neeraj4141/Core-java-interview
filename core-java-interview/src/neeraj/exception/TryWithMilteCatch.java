package neeraj.exception;

public class TryWithMilteCatch {

	public static void main(String[] args) {

		int a = 10;
		String name = "asdd";
		int c = a / 0;
		try {
			System.out.println(name.length());
			System.out.println("Divison = " + c);
		} catch (NullPointerException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
