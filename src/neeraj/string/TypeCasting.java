package neeraj.string;

public class TypeCasting {

	public static void main(String[] args) {

		// String to Integer

		String str = "200";

		int integer = Integer.parseInt(str);
		System.out.println(integer);

		int integer1 = Integer.valueOf(str);
		System.out.println(integer1);

		// Integer to String

		int num = 100;

		String str1 = Integer.toString(num);
		System.out.println(str1);

		String str2 = String.valueOf(num);
		System.out.println(str2);

	}

}
