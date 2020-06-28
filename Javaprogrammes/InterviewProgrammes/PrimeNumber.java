package InterviewProgrammes;

import java.util.Scanner;

public class PrimeNumber {

    public static boolean isPrime(int num) {
            if(num<=1){
                return false;
            }
            
            for(int i =2;i<=num;i++){
                if(i % num == 0){
                    return false;
                }
            }
            return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number wanted to get prime number upto :");
        int number = sc.nextInt();
        
    System.out.println(isPrime(number));
    sc.close();
    }
}
