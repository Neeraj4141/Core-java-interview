package neeraj.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		list.add("Neeraj");
		list.add("Dheeraj");
		list.add("Veeraj");
		list.add("Yuraj");
		list.add("Adhiraj");

		System.out.println(list);

		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(list.indexOf("Dheeraj"));
		System.out.println(list.get(4));
		System.out.println(list.set(1, "Mewada"));
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list);
	}

}
