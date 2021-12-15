package InterviewProgrammes;

public class Reverse_An_Integer {

	public static void main(String[] args) {
		
		//Soln 1: Using algo
		int num = 12345;
		int rev = 0;
		
		while(num !=0){
			rev = rev*10 + num % 10;
			num = num /10;
		}
		
		System.out.println("Rev number is :" + rev);
		
		
		//Soln2 : Using StringBuffer
		long num1 = 123456;
		System.out.println("Using String Buffer : " + new StringBuffer(String.valueOf(num1)).reverse());
		
	}
}
