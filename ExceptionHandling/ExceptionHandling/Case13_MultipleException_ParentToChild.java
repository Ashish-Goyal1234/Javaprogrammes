package ExceptionHandling;

import java.util.Scanner;

public class Case13_MultipleException_ParentToChild {

    /*
     * If we declare parent to child Exception order then compilere will throw Error Message Exception already caught.
     (Not recommended) parent to child exception order.
     */
    public static void main(String[] args) {
try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number :");
            int num = sc.nextInt();
            System.out.println(10/num);
            System.out.println("Ashish".charAt(12));
}catch(Exception e) {
    System.out.println("Parent exception");
}catch(ArithmeticException ae){
    System.out.println("Child exception");  // this will throw error if any exception occurs.
}
}
}
