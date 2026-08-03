package neeraj.string;

import javax.swing.text.StyledEditorKit.BoldAction;

public class StringMethod {

	public static void main(String[] args) {

		String name = "Neeraj";
		String str = "Mewada";

		System.out.println(name.length());
		System.out.println(name.trim().length());
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.startsWith("N"));
		System.out.println(name.endsWith("S"));
		System.out.println(name.charAt(3));
		System.out.println(name.indexOf("e"));
		System.out.println(name.lastIndexOf("e"));
		System.out.println(name.substring(1));
		System.out.println(name.trim());
		System.out.println(name.concat(str));
		System.out.println(str.concat(name));
		System.out.println(name.replace("Neeraj", "Rohit"));

		String str1 = "hello java";

		String[] s = str1.split(" ");

		for (String s1 : s) {
			System.out.println(s1);

		}

		System.out.println("..........................");

		String n1 = "java";
		String n2 = "java";

		String n3 = new String("java");
		String n4 = new String("java");

		boolean b = n1 == n2;
		System.out.println(b);

		boolean b1 = n1.equals(n2);
		System.out.println(b1);

		boolean b2 = n3 == n4;
		System.out.println(b2);

		boolean b3 = n3.equals(n4);
		System.out.println(b3);

		StringBuffer sb = new StringBuffer("hello");
		StringBuffer sb1 = new StringBuffer("hello");

		boolean b4 = sb.equals(sb1);
		System.out.println(b4);

	}

}
