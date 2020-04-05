package ExceptionHandling;

import java.util.Scanner;

public class Case17_ExceptionHandlerUsingPipes {
 
    // Piped Exception can be used in uncheck if exception is present in try block no issues.
    // Piped Exception used in checked exception must be present in try block otherwise error will occur (Refer Case18 example)
    
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number : ");
            int num = sc.nextInt();
            System.out.println(10/num);      // Ae
            System.out.println("ashish".charAt(12));  //SIOB
            sc.close();     // need to close scanner class.
            // Only AE and SIOB Exceptions are present other Exceptions are not present in try block.
            // It is ok it will execute but the same is not applicable to checked exception (ReferCase18)
        }catch(ArithmeticException | NumberFormatException ae){
            System.out.println("Entered into first piped catch block");
        }catch(StringIndexOutOfBoundsException | ClassCastException | NullPointerException a){
            System.out.println("Entered into second piped catch block");
        }
        System.out.println("Rest of the code.....!");
    }

}
