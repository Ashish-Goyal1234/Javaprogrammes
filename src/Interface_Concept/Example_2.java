package Interface_Concept;

interface intrface1 // abstract
{
	void m1(); // public abstract
	void m2();
	void m3();
}
abstract public class Example_2 implements intrface1
{	public void m1(){System.out.println("m1 method of parent class");}
public static void main(String[] args){
	Subchild obj=new Subchild();
	obj.m1();
	obj.m2();
	obj.m3();
}
}

abstract class child extends Example_2
{public void m2(){System.out.println("m2 method of child class");}
}


//We cannot create object of the class which is delared as abstract.
class Subchild extends child
{public void m3(){System.out.println("m3 method of sub child class");}
	
}

