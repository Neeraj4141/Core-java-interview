package neeraj.OOP.MethodOverloading;

public class TestPerson {

	public static void main(String[] args) {

		Person p = new Person();
		
		p.login("mewadaneeraj368@gmail.com ");
		
		p.login("mewadaneeraj368@gmail.com " , "Neeraj123 ");
		
		p.login("mewadaneeraj368@gmail.com " , "Neeraj123 ", "Neeraj");

	}

}
