package neeraj.collection;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add('a');
		list.add('b');
		list.add('c');

		List list2 = new ArrayList();

		list2.add('d');
		list2.add('e');

		System.out.println(list); // List ka pura data

		System.out.println(list.subList(1, 2)); // index 1 se 2 se pehle tak ki list

		System.out.println(list.get(2)); // index 2 ka element

		System.out.println(list.contains('a')); // 'a' present hai ya nahi → true/false

		System.out.println(list.addAll(list2)); // list2 ke saare elements list me add

		System.out.println(list.containsAll(list2)); // list2 ke saare elements list me hain ya nahi

		System.out.println(list.remove(2)); // index 2 ka element remove

		System.out.println(list); // puri list print

		list.clear(); // List ke saare elements remove

		System.out.println(list.isEmpty());

		System.out.println(list); // Clear hone ke baad ki empty list

	}
}