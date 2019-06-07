// Subclass of shape
public class Circle extends Shape {
	private double radius = 0.5;
	// Constructors to build Circle objects
	public Circle() {
		
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	public Circle(String color, boolean isFilled, double radius) {
		super(color, isFilled);
		this.radius = radius;
	}
	// Mutator for radius
	public void setRadius(double radius) {
		this.radius = radius;
	}
	// Accessors for radius area and perimeter
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		double area = Math.PI * (radius * radius);
		return area;
	}
	public double getPerimeter() {
		double perimeter = Math.PI * radius * 2;
		return perimeter;
	}
	// toString used to get the color, area, perimeter, and isFilled status
	public String toString() {
		String s = "The " + getColor() + " circle area is " + getArea() + "\n" + "The perimeter is " + getPerimeter() + "\n" + "filled is " + getisFilled();
		return s;
	}
}
