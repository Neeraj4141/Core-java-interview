package neeraj.exception;

public class TryWithoutCatch {

	public static void main(String[] args) {

		try {
			System.out.println("Hello");
		} finally {
			System.out.println("Finally");
		}
	}

}
