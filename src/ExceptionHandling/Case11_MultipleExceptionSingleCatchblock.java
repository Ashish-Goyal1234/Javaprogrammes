package ExceptionHandling;

import java.util.Scanner;

public class Case11_MultipleExceptionSingleCatchblock {

    public static void main(String[] args) {
       try{
           Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();
        System.out.println(10/num);
        System.out.println("Ashish".charAt(12));
        sc.close();     // need to close scanner class.
       }catch(Exception e) {
           System.out.println("Exception occured : " + e); // E describes about name of exception.
       }
    }

}
