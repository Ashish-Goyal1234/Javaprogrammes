package Interface_Concept;

interface intrface   //abstract
{
	void m1();  // public abstract
	void m2();
	void m3();
}


 class Example_1 implements intrface{
	public void m1(){       //need to declare public becuase we need to maintain permission on same  
							//	level cannot decrese the level of permission because java does not support to decrese the permission.
		 System.out.println("m1 method");
	 }
	 
	public void m2(){
		 System.out.println("m2 method");
	 }
	 
	  public void m3(){
		 System.out.println("m3 method");
	 }
	public static void main(String[] args) {
		Example_1 t = new Example_1();
		t.m1();
		t.m2();
		t.m3();
	
		
		//interface able to hold implements class object also.
		intrface i = new Example_1();
		i.m1();
		i.m2();
		i.m3();
	}

}
