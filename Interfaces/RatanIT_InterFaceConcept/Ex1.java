package RatanIT_InterFaceConcept;

interface it1 {
	public void m1();
	public void m2();
}

public class Ex1 implements it1{

	public void m1(){
		System.out.println("M1 method");
	}
	
	public void m2(){
		System.out.println("M2 method");
	}
	
	public static void main(String[] args) {
		Ex1 e = new Ex1();
		e.m1();e.m2();
		
		//WebDriver driver = new FireFoxdriver();
		it1 i = new Ex1();
		i.m1();i.m2();
	}
}
