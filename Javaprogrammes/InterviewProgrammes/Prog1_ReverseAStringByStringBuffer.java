package InterviewProgrammes;

import java.util.Scanner;

public class Prog1_ReverseAStringByStringBuffer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to Reverse :");
        String s = sc.nextLine();
        StringBuffer sb = new StringBuffer(s);
        StringBuffer rev = sb.reverse();
        String s1 = rev.toString();
        System.out.println(s1);
        sc.close();
    }

}
