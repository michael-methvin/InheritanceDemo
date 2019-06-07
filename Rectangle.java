// Derived class of shape and super class of square
public class Rectangle extends Shape {
	private double width;
	private double length;
	// Empty constructor here to set default values to 1
	public Rectangle() {
		this.width = 1;
		this.length = 1;
	}
	// Additional constructors depending on what needs to be called from square
	public Rectangle(String color, boolean isFilled) {
		setFilled(isFilled);
		setColor(color);
	}
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	public Rectangle(String color, boolean isFilled, double width, double length) {
		super(color, isFilled);
		this.length = length;
		this.width = width;
	}
	// Mutators to change width and length
	public void setWidth(double width) {
		this.width = width;
	}
	public void setLength(double length) {
		this.length = length; 
	}
	// Accessors to get width, length, area, and perimeter
	public double getWidth() {
		return width;
	}
	public double getLength() {
		return length;
	}
	public double getArea() {
		double area = length * width;
		return area;
	}
	public double getPerimeter() {
		double perimeter = (2 * length) + (2 * width);
		return perimeter;
	}
	// toString used to display length, width, area, perimeter, color and isFilled status of rectangle objects
	public String toString() {
		String s = "Rectangle(" + length + ", " + width + ") Area is " + getArea() + ", Perimeter is " + getPerimeter() + "\n" + "     color is " + getColor() + "\n" + "     filled is " + getisFilled();
		return s;
	}
}