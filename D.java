class A {
	public void ma1() { 
		System.out.println("CA ");
		}
}
class B extends A {
	public void ma1() { 
		System.out.println("B from A ");
		}
	// (2 points) add codes here (…methods that may overrides parent plus B class methods) 
	public void ma2() {
		System.out.println("B only static");
	}
	public void ma10() {
		System.out.println("B only static");
	}
}
class C extends B {
//(…methods that may overrides parent plus C class methods)
	public void ma1() {
		System.out.println("C from A");
	}
	public void ma2() {
		System.out.println("B from ");
	}
	public void ma3() {
		System.out.println("C only static");
	}
}

public class D {
	public static void main(String[] args)
	{
	  A a = new A();  //A-Type variable refers to A-Type object
	  // (10 points) (make some objects of various classes)             
	  B b = new B();
	  A c = new C();
	  c.ma1();
	  a.ma1();
	  b.ma1();
	}

}
