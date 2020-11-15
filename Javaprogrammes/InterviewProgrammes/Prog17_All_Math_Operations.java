package InterviewProgrammes;

import java.util.Scanner;

public class Prog17_All_Math_Operations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number to perfoem mathematical operations :");
        int num1 = sc.nextInt();
        System.out.println("Enter Second number to perform mathematical operations : ");
        int num2 = sc.nextInt();
        System.out.println("Addition :"+ Math.addExact(num1,num2));
        System.out.println("Multiplication :"+ Math.multiplyExact(num1,num2));
        System.out.println("Division :" + Math.floorDiv(num1, num2));
        System.out.println("Subtract :"+ Math.subtractExact(num1, num2));
        sc.close();
    }
}