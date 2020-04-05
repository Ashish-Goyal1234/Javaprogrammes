package ExceptionHandling;

import java.util.Scanner;

public class Case10_TryWithMultipleCatch_1 {

    public static void main(String[] args) {
     try{
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        System.out.println(10/num);  //AE
        System.out.println("Ashish".charAt(12));  //SIOBE
        sc.close();     // need to close scanner class.
     }catch(ArithmeticException ae) {
         System.out.println("Entered in Arithmetic exception catch block");
     }catch(StringIndexOutOfBoundsException sb) {
         System.out.println("Entered in StringIndexOutOfBoundsException block");
     }
    }

}
