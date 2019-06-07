// Testing the square class
public class SquareTest {

	public static void main(String[] args) {
		// Building two square objects s1 and s2 then calling their toStrings
		Rectangle s1 = new Square("Red", false, 1.0, 1.0);
		System.out.println(s1);
		Rectangle s2 = new Square("Purple", true, 6.0, 6.0);
		System.out.println(s2);
	}

}
