package neeraj.collection;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		map.put(1, 10);
		map.put(2, 20);
		map.put(null, null);
		map.put(3, null);

		// null values store karta hee
		// shorting maintain nahi hee

		System.out.println(map.get(1));

		System.out.println(map.containsKey(3));

		System.out.println(map.containsValue("Two"));

		System.out.println(map);

		map.clear();

		System.out.println(map);
	}

}
