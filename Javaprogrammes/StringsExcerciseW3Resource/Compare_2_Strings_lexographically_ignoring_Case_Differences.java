package StringsExcerciseW3Resource;
import java.util.Scanner;

// Write a Java program to compare two strings lexicographically (alpabetically order), ignoring case differences

public class Compare_2_Strings_lexographically_ignoring_Case_Differences {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter String 1 :");
         String s1 = sc.nextLine().toLowerCase();
         System.out.println("Enter String 2 :");
         String s2 = sc.nextLine().toLowerCase();
         compareTwoStringsLexographically(s1, s2);
         sc.close();
    }
    
    
    private static void compareTwoStringsLexographically(String s1, String s2){
        if(s1.equalsIgnoreCase(s2)){
            System.out.println(s1 + " is equals to " + s2);
        }else{
            System.out.println(s1 + " is not equals to " + s2);
        }
    }

}
