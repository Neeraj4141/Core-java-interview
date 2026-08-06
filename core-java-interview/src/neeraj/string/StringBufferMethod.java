package neeraj.string;

public class StringBufferMethod {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("neeraj");

		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(sb.deleteCharAt(5));
		System.out.println(sb.delete(0, 2));
		System.out.println(sb.toString());
		System.out.println(sb.append("mewada"));
		System.out.println(sb.insert(0, "e"));
		System.out.println(sb.insert(0, "n"));
		System.out.println(sb.indexOf("w"));
		System.out.println(sb.charAt(4));
		System.out.println(sb.replace(0, 4, "N"));
		System.out.println(sb.reverse());
	}

}
