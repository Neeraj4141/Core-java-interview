package neeraj.string;

public class StringImmutableOrNot {

	public static void main(String[] args) {

		// string is immutable agar object bn gya to change nahi hoga
		String n1 = "Neeraj";
		n1.concat("Mewada");
		System.out.println(n1);

		// object me hold krwa kr krenge to ho jayega change
		n1 = n1.concat("Mewada");
		System.out.println(n1);

		// stringbuffer is mutable
		StringBuffer sb = new StringBuffer("Neeraj");
		sb.append("Mewada");
		System.out.println(sb);
	}

}
