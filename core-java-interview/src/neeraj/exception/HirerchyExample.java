package neeraj.exception;

public class HirerchyExample {

	public static void main(String[] args) {
		String name = "Neeraj";

		try {
			System.out.println(name.charAt(10));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Index Out Of Bound Bhai ");
		} catch (Exception e) {
			System.out.println("Exception ............");
		} finally {
			System.out.println("I Am Always Exicute Bhai ");
		}

	}

}
