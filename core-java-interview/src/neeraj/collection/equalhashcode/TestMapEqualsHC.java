package neeraj.collection.equalhashcode;

import java.util.HashMap;
import java.util.Map;

import neeraj.collection.comparable.Employee;

public class TestMapEqualsHC {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "Neeraj", 10000);
		Employee e2 = new Employee(1, "Neeraj", 10000);

		Map m = new HashMap();

		m.put(e1, "Employee1");
		m.put(e2, "Employee2");

		System.out.println(m);
		System.out.println(m.size());
	}

}
