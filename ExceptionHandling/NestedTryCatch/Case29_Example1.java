    package NestedTryCatch;

import java.util.Scanner;

public class Case29_Example1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
            int num = sc.nextInt();
            try{
                System.out.println(10/num);
                    try{
                        System.out.println("ashish".charAt(12));
                    }catch(StringIndexOutOfBoundsException e){
                        System.out.println("Entered into StringIndexOutOfBoundException");
                    }
                    sc.close();
            }catch(ArithmeticException ae){
                System.out.println("Entered in arithmeticException block");
            }finally{
                System.out.println("Entered Into Finally block");
            }
            System.out.println("Rest of the application");
    }

}
