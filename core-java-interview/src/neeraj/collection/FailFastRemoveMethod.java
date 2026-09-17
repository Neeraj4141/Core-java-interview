package neeraj.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastRemoveMethod {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);

		System.out.println(list);

		Iterator it = list.iterator();

		while (it.hasNext()) {
			Integer s = (Integer) it.next();

			if (s.equals(4)) {
				it.remove();
			}

			//it.remove();
		}
		System.out.println(list);
	}

}
