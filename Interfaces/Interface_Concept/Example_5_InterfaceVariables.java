package Interface_Concept;

interface it11{ //abstract
	int a=10;  //public static  final
	void m1(); //public abstract
}
public class Example_5_InterfaceVariables implements it11 {
	public void  m1(){
//		a=a+10;
	}
	public static void main(String[] args) {

		new Example_5_InterfaceVariables().m1();
	}

}

/*This Programme Will give compilation error:
	In interface we declared a and by default a is assigned as final varaibale.
	Now we are trying to change a value in m1(), so it will give error cannot change the value ,
	of final variable.*/