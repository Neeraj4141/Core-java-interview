package neeraj.exception;

public class TestSystemExit {

	public static void main(String[] args) {

		String name = null;

		try {
			System.out.println(name.length());
		} catch (Exception e) {
			System.exit(0);
			System.out.println("catch");
			e.printStackTrace();
		} finally {
			System.out.println("finally");
		}
	}

}
