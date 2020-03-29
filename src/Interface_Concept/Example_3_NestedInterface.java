package Interface_Concept;

interface it1
{
	interface it2{
		void m1();
	}
}
/* 
 * Whenever we find '.' its is map.entry:
   E.g: map.entry map in main interface and entry is sub interface.
 */
public class Example_3_NestedInterface implements it1.it2{

	public void m1(){
		System.out.println("M1 method");
	}
	public static void main(String[] args) {
		new  Example_3_NestedInterface().m1();
	}

}
