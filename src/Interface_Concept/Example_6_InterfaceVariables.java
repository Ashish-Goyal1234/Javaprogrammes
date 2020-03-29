package Interface_Concept;

interface int1{ //abstract
	int a=10;  //public static  final
}

interface int2{ //abstract
	int a=100;  //public static  final
}
public class Example_6_InterfaceVariables implements int1,int2{
	public void  m1(){
		//System.out.println(a);   // This statement will return ambiquity error two variables having same value as we implements 2 interface. 
		System.out.println(int1.a);
		System.out.println(int2.a);
	}
	public static void main(String[] args) {
		new Example_6_InterfaceVariables().m1();
	}

}
