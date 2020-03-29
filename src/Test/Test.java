package Test;

import java.util.Scanner;

public class Test {

    static String status(int age) {
        if(age<20) {
            return "elgible";
        }else{
            return "noteligible";
        }
    }
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("enter your age");
        int age = s.nextInt();
        String str = status(age);
    System.out.println("your status is = "+ str);
    }

}
