package neeraj.exception;

public class TestNumberFormateException {

	public static void main(String[] args) {

		String str = "Neeraj123";

		try {
			System.out.println(Integer.parseInt(str));
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
	}

}
