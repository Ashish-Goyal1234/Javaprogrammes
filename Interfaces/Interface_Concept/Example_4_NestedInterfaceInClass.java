package Interface_Concept;

class A
{
	interface it2{
		void m1();
	}
}
/* 
 * Whenever we find '.' its is map.entry:
   E.g: map.entry map in main interface and entry is sub interface.
 */
public class Example_4_NestedInterfaceInClass implements A.it2{

	public void m1(){
		System.out.println("M1 method inside the class");
	}
	public static void main(String[] args) {
		new  Example_4_NestedInterfaceInClass().m1();
	}

}