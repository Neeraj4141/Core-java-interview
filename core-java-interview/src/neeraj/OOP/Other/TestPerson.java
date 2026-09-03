package neeraj.OOP.Other;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {
	public static void main(String[] args) throws ParseException {

		Person p = new Person();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		p.setName("Neeraj");
		p.setAddress("Indore");
		p.setDob(sdf.parse("12-12-2001"));
		p.setMobileNo("9876654332");

		System.out.println(p.getAddress());
		System.out.println(p.getMobileNo());
		System.out.println(p.getName());
		System.out.println(p.getDob());
	}

}
