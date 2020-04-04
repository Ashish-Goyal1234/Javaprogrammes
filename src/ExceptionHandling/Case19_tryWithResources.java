package ExceptionHandling;

import java.io.FileInputStream;
import java.util.Scanner;

public class Case19_tryWithResources {

    // Declare the resource by using try block once try block completed resource will automatically gets closed.
    
    public static void main(String[] args) {
        try(Scanner sc= new Scanner(System.in) ; FileInputStream fis = new FileInputStream("abc.txt")){   // no need to close scanner as used in try block.
            
            System.out.println("Enter a number :");
            int num = sc.nextInt();
            System.out.println("User entered :" + num);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
