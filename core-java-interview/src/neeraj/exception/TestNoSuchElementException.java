package neeraj.exception;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class TestNoSuchElementException {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();

		list.add("Neeraj");
		list.add("Lucky");
		list.add("Rishab");

		Iterator it = list.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
		try {
			System.out.println(it.next());
		} catch (NoSuchElementException e) {
			System.out.println(e);
		} finally {
			System.out.println("finally");
		}
	}

}
