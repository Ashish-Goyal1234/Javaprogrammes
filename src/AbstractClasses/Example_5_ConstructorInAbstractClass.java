package AbstractClasses;

abstract public class Example_5_ConstructorInAbstractClass {

	Example_5_ConstructorInAbstractClass(){
		System.out.println("Abstract class constructor");
	}
	
	public static void main(String[] args){
		new constructorchild();
	}
}


class constructorchild extends Example_5_ConstructorInAbstractClass{
	
	constructorchild(){
		super();   // Super keyword is used to call parent class constructor.
		//Even we dont write super keyword by default compiler will call zero arg constructor is called.
		
		System.out.println("child class constructor");
	}
}
