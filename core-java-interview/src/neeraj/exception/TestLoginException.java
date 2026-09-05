package neeraj.exception;

public class TestLoginException {

	public static void main(String[] args) {
		String r = "admi";

		try {
			if (r.equals("admin")) {
				System.out.println("Bhai Valid User Hee");
			} else {
				throw new LoginException();
			}
		} catch (LoginException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
