package AbstractClasses;

abstract public class Example_4_AbstractMethodOverloaded {
//overloaded abstract methods
	abstract void m1(int a);
	abstract void m1(int a, int b);
	abstract void m1(char ch);
	
	public static void main(String[] args) {
 		child1 ch = new child1();
 		ch.m1('a');
 		ch.m1(10);
 		ch.m1(10,20);
 	}
}


 class child1 extends Example_4_AbstractMethodOverloaded{
 void m1(int a){
	 System.out.println("M1 method overloading 1 args");
 }
 
 void m1(int a, int b){
	 System.out.println("M1 method overloading 2 args");
	 }
 
 void m1(char ch){
	 System.out.println("M1 method overloading ch args");
 }
 
}

