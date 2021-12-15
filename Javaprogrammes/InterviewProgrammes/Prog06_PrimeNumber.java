
package InterviewProgrammes;

public class Prog06_PrimeNumber {
    public static void main(String[] args) {
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