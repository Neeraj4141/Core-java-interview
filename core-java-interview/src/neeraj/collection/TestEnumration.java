package neeraj.collection;

import java.util.Enumeration;
import java.util.Vector;

public class TestEnumration {

	public static void main(String[] args) {

		Vector v = new Vector();

		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);

		Enumeration e = v.elements();

		while (e.hasMoreElements()) {

			System.out.println(e.nextElement());
		}
	}

}
