package AbstractClasses;

abstract class abc{
	abstract void m1();
}

public class childClass extends AbstractClass{

	void m1(){
		System.out.println("M1 method");

	}
	 void m2(){
			System.out.println("M2 method");

	}
	 void m3(){
			System.out.println("M3 method");

	}
	
	public static void main(String[] args) {
		//AbstractClass ab = new AbstractClass();  we cannot create object for abstract class.
		childClass t = new childClass();
		t.m1();
		t.m2();
		t.m3();
		t.m4();
		// Parent class can hold object fo child class object.
		// Parent p = new child();   // Allowed.
		AbstractClass ab = new childClass();
		ab.m1(); ab.m2(); ab.m3(); ab.m4();
		
		
	}

}
