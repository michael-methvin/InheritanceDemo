class Base {
	void methodOfBase()	{
		System.out.println("From Parent Class");
	}
}
class Derived extends Base {
	void methodOfBase()	{
		System.out.println("From Derived Class");
	}
}
public class TestDynamicBinding {
	public static void main(String[] args) {
		// add missing codes here…	
		Base b1 = new Base();
		util(b1);
		Base b2 = new Derived();
		util(b2);
		Derived b3 = new Derived();
		util(b3);
	}
	public static void util(Base a) { // add proper arguments here
	 // add missing codes here
		a.methodOfBase();
	}

}
