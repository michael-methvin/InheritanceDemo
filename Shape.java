//Base class used to set the color and filled status of a unknown shape
public class Shape {
	// Setting default values to red and filled
	private String color = "Red";
	private boolean isFilled = true;
	
	// Constructors
	public Shape() {
		
	}
	
	public Shape(String color, boolean isFilled) {
		this.color = color;
		this.isFilled = isFilled;
	}
	//Accessors for the filled status and the color
	public boolean getisFilled() {
		return isFilled;
	}
	public String getColor() {
		return color;
	}
	// Mutators for the filled status and the color
	public void setColor(String color) {
		this.color = color;
	}
	public void setFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}
	// Returns the color and filled status to use when building shape objects
	public String toString() {
		String s = "The shape color is " + color + " and the isFilled status is " + isFilled;
		return s;
	}
}
