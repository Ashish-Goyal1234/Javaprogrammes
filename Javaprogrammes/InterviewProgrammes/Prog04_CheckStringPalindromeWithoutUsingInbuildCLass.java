package InterviewProgrammes;

import java.util.Scanner;

public class Prog04_CheckStringPalindromeWithoutUsingInbuildCLass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int length = str.length();
       String temp="";
        
        for(int  i = length-1 ;i>=0;i--){
            temp = temp+str.charAt(i);
        }
        if(temp.equalsIgnoreCase(str)){
            System.out.println("Palindrome");
        }else{
            System.out.println("not Palindrome");
        }
        sc.close();
    }

}
