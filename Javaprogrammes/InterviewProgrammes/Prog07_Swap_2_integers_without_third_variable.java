package InterviewProgrammes;


public class Prog07_Swap_2_integers_without_third_variable {

    public static void main(String[] args) {
            int x = 5;
            int y = 10;
            int temp;
            
            // 1. With using temp variable.
            temp = x;
            x = y;
            y=temp;
            System.out.println("X :" + x);
            System.out.println("Y :" + y);
            
        System.out.println("*************");    
        
            // 2. Without using temp variable using + operator.
            x  = x+y;   //15
            y= x-y;    // 5
            x = x-y;   // 10
            System.out.println("X : " + x);
            System.out.println("Y : " + y);
        
            System.out.println("*************");    
            
            // 2. Without using temp variable using * operator.
            x  = x * y;   //50
            y= x / y;    // 5
            x = x /y;   // 10
            System.out.println("X : " + x);
            System.out.println("Y : " + y);
    }

}
