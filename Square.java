// Square class derived from shape and rectangle
public class Square extends Rectangle {

	// Constructors to build square objects
	public Square() {
		
	}
	public Square(double length) {
		
	}
	public Square(String color, boolean isFilled, double length, double width) {
		super(color, isFilled, length, width);
	}
	// Accessors for side length, area, and perimeter
	public double getSide() {
		return getWidth();
	}
		// toString used to retrieve side length, area, perimeter, color, and isFilled status
	public String toString() {
		String s = "Square (" + getSide() + ") Area = " + getArea() + " Perimeter = " + getPerimeter() + " Color = " + getColor() + " Filled = " + getisFilled();
		return s;
	}
}
