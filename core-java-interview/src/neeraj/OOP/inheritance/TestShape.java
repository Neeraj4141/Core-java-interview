package neeraj.OOP.inheritance;

public class TestShape {

	public static void main(String[] args) {

		Shape s = new Shape();

		s.area();

		// Normal Rectangle object
		Rectangle r = new Rectangle();

		r.setColor("Red");
		r.setName("Rectangle");
		r.setLength(5);
		r.setWidth(5);
		r.area();

		// Upcasting — Parent reference, Child object
		Shape shape = new Rectangle();

	
		shape.setColor("Red");
		shape.setName("Rectangle");
		System.out.println(shape.getColor());
		System.out.println(shape.getName());

		// Downcasting — Parent reference ko Child reference mein convert karna.
		Rectangle rectangle = (Rectangle) shape;

		rectangle.setLength(5);
		rectangle.setWidth(5);
		rectangle.area();
		shape.area();

	}

}
