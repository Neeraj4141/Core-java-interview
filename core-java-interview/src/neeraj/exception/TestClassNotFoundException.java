package neeraj.exception;

public class TestClassNotFoundException {

	public static void main(String[] args) {
		try {
			Class.forName("neeraj.exception.TestAccount");
			System.out.println("Class Mil Gyi");
		} catch (ClassNotFoundException e) {
			System.out.println("Class Nahi Mili " + e);

		}
	}

}
