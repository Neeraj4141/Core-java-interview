package neeraj.OOP.withoutconstructor;

public class Circle extends Shape {

	public static final double PI = 3.14;

	public double redius;

	public double getRedius() {
		return redius;
	}

	public void setRedius(double redius) {
		this.redius = redius;
	}

	@Override
	public double area() {
		double area = PI * redius * redius;
		return area;
	}

}
