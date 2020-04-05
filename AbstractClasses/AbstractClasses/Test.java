package AbstractClasses;

abstract class test// abstract
{
	abstract void m1(); // public abstract
	abstract void m2();
	abstract void m3();
	void m4(){System.out.println("M4 method");}
}
abstract class test1 extends test 
{	public void m1(){System.out.println("m1 method");}}

abstract class test2 extends test1
{	public void m2(){System.out.println("m2 method");}}

class test3 extends test2{
	void m3(){
		System.out.println("m3 method");
	}
	public static void main(String[] args){
		test3 t= new test3();
		t.m1();t.m2();t.m3();t.m4();
	}
}

