// Testing the rectangle class
public class RectangleTest {
	public static void main(String[] args) {
		// Building rectangle objects r1 and r2. And then calling the toString for both
		Rectangle r1 = new Rectangle("Red", false, 1.0, 1.0);
		System.out.println(r1);
		Rectangle r2 = new Rectangle("Green", true, 4, 5);
		System.out.println(r2);
	}
}
