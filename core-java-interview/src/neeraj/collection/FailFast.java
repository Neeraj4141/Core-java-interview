package neeraj.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFast {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();

		list.add('a');
		list.add('b');
		list.add('c');
		list.add('d');
		list.add('e');
		list.add('f');

		Iterator it = list.iterator();

		list.add('r'); // Iterator banne ke baad direct add nahi kr skte
		list.remove(1); // Iterator banne ke baad direct remove nahi kr skte

		// Isliye ise Fail-Fast kehte hain — problem detect hote hi Iterator turant
		// fail/stop ho jata hai.

		while (it.hasNext()) {
			System.out.println(it.next());

		}

	}

}
