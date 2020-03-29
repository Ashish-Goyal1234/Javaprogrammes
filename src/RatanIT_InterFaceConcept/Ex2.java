package RatanIT_InterFaceConcept;

interface message{
	void wish();
}

 class Ex2 implements message{
	public void wish(){
		System.out.println("Hello");
	}
	
	public static void main(String[] args){
		message m = new Ex2();
		m.wish();
		
		message m1 = new Ex21();
		m1.wish();
		
	}
}

class Ex21 implements message{
	
	public void wish(){
		System.out.println("hi how are you");
	}
}
