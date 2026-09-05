package neeraj.exception;

public class TestArrayIndexOutOfBound {

	public static void main(String[] args) {

		int[] i = { 1, 2, 3, 4, 5, 6 };

		try {
			System.out.println(i[7]);

		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("Index se jada nahi milega nahi to exception aa jaigi bhai ");
		}
	}

}
