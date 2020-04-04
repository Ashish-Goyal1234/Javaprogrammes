package ExceptionHandling;

import java.util.Scanner;

public class Case12_MultipleException_childToParentException {
    
 // Always Keep exception order from child to parent in case of Multiple catch blocks.
    
    public static void main(String[] args) {
        try{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        System.out.println(10/num);
        System.out.println("Ashish".charAt(12));
        sc.close();     // need to close scanner class.
        // child to parent order
        }catch(ArithmeticException ae){   //child exception (recommended child to parent exception always)
            System.out.println("Entered into child exception : " + ae);
        }catch(Exception e){    //Parent exception
            System.out.println("Entered into parent exception : " + e);
        }
    }

}
