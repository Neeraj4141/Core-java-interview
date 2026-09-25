package neeraj.exception;

public class TryWithMilteCatch {

	public static void main(String[] args) {

		int a = 10;
		String name = "asdd";
	
		try {
			int c = a / 0;
			System.out.println(name.length());
			System.out.println("Divison = " + c);
		} catch (NullPointerException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}finally {
			System.out.println("finally");
		}
	}

}
