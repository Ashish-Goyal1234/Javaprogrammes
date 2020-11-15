
package InterviewProgrammes;

public class Prog5_PrimeNumber {
    public static void main(String[] args) {
  /*   System.out.println("2 is prime number :" + isPrime(2));   
     System.out.println("3 is prime number :" + isPrime(3));   
     System.out.println("10 is prime number :" + isPrime(10));  
     System.out.println("17 is prime number :" + isPrime(17));   */
        getPrimeNumbers(20);
    }
    
    
    private static void getPrimeNumbers(int number){
        for(int i = 2; i <= number; i++){
            if(isPrime(i)){
                System.out.print( i + " ");
            }
        }
    }
    
    private static boolean isPrime(int num){
        if(num<=1){ 
            return false;
        }
      
       for(int i = 2; i < num; i++){
        if( num % i == 0){
            return false;
       }
     }
        return true;
    }
    
}