package neeraj.OOP.Other;

public class ConstructorCalling {

	public String fName;
	public String lName;

	public ConstructorCalling() {

	}

	public ConstructorCalling(String fName) {
		this();
		this.fName = fName;
		System.out.println(fName);
	}

	public ConstructorCalling(String fName, String lName) {
		this(fName);
		this.lName = lName;
		System.out.println(lName);
	}

}
