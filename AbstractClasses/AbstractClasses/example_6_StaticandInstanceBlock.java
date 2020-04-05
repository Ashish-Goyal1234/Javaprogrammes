package AbstractClasses;

abstract public class example_6_StaticandInstanceBlock {

	{
		System.out.println("Instace vlock in abstract class");
	}
	
	static{
		System.out.println("static vlock in abstract class");
	}
	
	example_6_StaticandInstanceBlock(){
		System.out.println("Constructor ofabstract class");
	}
	
	public static void main(String[] args){
		new child2();
	}
}

class child2 extends example_6_StaticandInstanceBlock{
	child2(){
		super();  // Super keyword is used to call parent class constructor.
		System.out.println("child class constructor");
	}
}
