package neeraj.exception;

public class TestStringOutBound {

	public static void main(String[] args) {

		String n = "abc";

		try {
			System.out.println(n.charAt(3));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}

}
