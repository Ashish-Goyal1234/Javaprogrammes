package InterviewProgrammes;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number upto print fibonnaci series :");
            int Uptonum = sc.nextInt();
            
            
            int num1 = 0;
            int num2 = 1, num3 ;
            for(int i=2;i<=Uptonum;i++){
           num3 = num1 + num2;
           System.out.println(num3);
           num1 = num2; 
           num2 = num3; 
            }
         
            sc.close();
    }

}
