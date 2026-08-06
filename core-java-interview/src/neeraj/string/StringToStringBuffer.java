package neeraj.string;

public class StringToStringBuffer {
	public static void main(String[] args) {

		String n = "Neeraj";

		StringBuffer sb = new StringBuffer(n);
		System.out.println(sb);
		System.out.println(sb.append("Mewada"));
	}

}
