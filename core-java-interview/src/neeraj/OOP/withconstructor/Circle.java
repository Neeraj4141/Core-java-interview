package neeraj.OOP.withconstructor;

public class Circle extends Shape {

	public int redius;

	public static final double PI = 3.14;

	public Circle(int redius) {
		this.redius = redius;
	}

	@Override
	public double area() {
		return PI * redius * redius;
	}

}
