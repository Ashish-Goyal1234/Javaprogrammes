package AbstractClasses;

 abstract class Example_3_Argument_and_ReturnTypr {

	abstract int m1(char h, int a);
	abstract float m2(boolean b);
	abstract String login(String uname, String password);
	
	public static void main(String[] args){
		subchild sub = new subchild();
		sub.m1('a', 10);sub.m2(true);sub.login("abc", "pqr");
	}	
}

abstract class child extends Example_3_Argument_and_ReturnTypr{
	int m1(char h, int a){ System.out.println("m1 aaa method"); return 0;}
	
	float m2(boolean b){System.out.println("m2 bbb method");	return 0;}
}



 class subchild extends child{
	 String login(String uname, String password){
			System.out.println("m3 ccc method");
			return null;
		}

}