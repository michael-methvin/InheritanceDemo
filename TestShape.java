
public class TestShape {
	public static void main(String[] args) {
		// Building a shape object to test methods
		Shape s1 = new Shape();
		System.out.println(s1); // Expecting "The shape color is Red and the isFilled status is true
		s1.setColor("Pink");
		s1.setFilled(false); // testing the setColor and setFilled
		System.out.println("Changing shape values....");
		System.out.println(s1); // Expecting "The shape color is Pink and the isFilled status is false
	}
}
