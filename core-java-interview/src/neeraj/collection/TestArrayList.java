package neeraj.collection;

import java.util.ArrayList;
import java.util.Collections;

public class TestArrayList {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();

		list.add("Neeraj");
		list.add("Mewada");
		list.add("Indore");
		list.add("Nolakha");

		Collections.reverse(list);

		System.out.println(list);

	}

}
