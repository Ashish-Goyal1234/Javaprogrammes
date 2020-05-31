package InterviewProgrammes;

import java.util.Scanner;

public class PalindromeOrNot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to check palindrome or Not :");
        String s = sc.nextLine();
        StringBuffer sb = new StringBuffer(s);
        StringBuffer rev = sb.reverse();
        String reverse = rev.toString();
        if(reverse.equalsIgnoreCase(s)){    // This will compare without comparing case sensitivity. (Madam : for normal 'compare' throws not palindrome as first m is capital)
            System.out.println("Entered String is palindrome...!");
        }else{
            System.out.println("Entered String is not a Palindrome...!");
        }
        
        sc.close();
    }

}
