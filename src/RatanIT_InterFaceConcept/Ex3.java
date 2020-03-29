package RatanIT_InterFaceConcept;

interface message1{
	
	void wish();
	void wish2();
}

abstract class Ex3 implements message1{
	public void wish(){
		System.out.println("Ex3 implementation");
	}
	
	public static void main(String[] args) {
		ex31 e = new ex31();
		e.wish();e.wish2();
	}
}

class ex31 extends Ex3{
	public void wish2(){
		System.out.println("ex31 implementation");
	}
	

}
