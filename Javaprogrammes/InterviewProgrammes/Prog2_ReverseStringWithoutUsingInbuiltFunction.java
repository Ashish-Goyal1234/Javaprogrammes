package InterviewProgrammes;

import java.util.Scanner;

public class Prog2_ReverseStringWithoutUsingInbuiltFunction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A String For Reverse : ");
        String s = sc.nextLine();
        String rev = "";
        int len = s.length();
        for(int i=len-1; i>=0;i--){
            rev = rev + s.charAt(i);
        }
        System.out.println(rev);
        sc.close();
    }

}
