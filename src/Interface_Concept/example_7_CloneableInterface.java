package Interface_Concept;

public class example_7_CloneableInterface implements Cloneable{
	
	int a=10;
	int b=20;
	public static void main(String[] args) throws Exception {
		example_7_CloneableInterface t = new example_7_CloneableInterface();
		System.out.println("initial Value :"+ t.a);
		System.out.println("initial Value :"+ t.b);
		
		t.a=100;
		t.b=200;
		
		System.out.println("Updated Value :"+ t.a);
		System.out.println("Updated Value :"+ t.b);
		
		example_7_CloneableInterface t1 = (example_7_CloneableInterface)t.clone(); // typecaste to clone the value.
	
		t.a=777;
		t.b=888;
		System.out.println("Second time updated Value :"+ t.a);
		System.out.println("Second time updated Value :"+ t.b);
		
		System.out.println("Cloning Value :"+ t1.a); //Will print cloning value.
		System.out.println("Cloning Value :"+ t1.b); // will print cloning value.
		
	}

}
