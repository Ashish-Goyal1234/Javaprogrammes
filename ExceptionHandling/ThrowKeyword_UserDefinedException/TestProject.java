package ThrowKeyword_UserDefinedException;

import java.util.Scanner;
import ExceptionHandling.ThrowKeyword_UserDefinedException.InvalidAgeException;

public class TestProject {
    
    static void status(int age) throws InvalidAgeException{
        if(age>20){
            System.out.println("eligible for marriage");
        }else{
            //throw new InvalidAgeException();   // we have created user-Defined checked Exception.
            throw new InvalidAgeException("you are not eligible");
        }
    }

    public static void main(String[] args) throws InvalidAgeException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int age1 = sc.nextInt();
        TestProject.status(age1);
        sc.close();
    }

}
