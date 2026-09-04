package neeraj.exception;

public class TestNullPointerException {

	public static void main(String[] args) {

		String s = null;

		try {
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println("Object ki value null he length nahi niklegi bhai");
		}
	}

}
