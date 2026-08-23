package neeraj.OOP.inheritance;

public class Shape {

	public String color;
	public String name;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void area() {
		System.out.println("area of shape");
	}

}
