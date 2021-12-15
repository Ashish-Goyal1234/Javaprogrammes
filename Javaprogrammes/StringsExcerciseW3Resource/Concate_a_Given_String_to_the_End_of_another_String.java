package StringsExcerciseW3Resource;
import java.util.Scanner;

//Write a Java program to concatenate a given string to the end of another string

public class Concate_a_Given_String_to_the_End_of_another_String {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1 :");
        String s1 = sc.nextLine();
        System.out.println("Enter String 2 :");
        String s2 = sc.nextLine();
        System.out.println(concate(s1, s2));
        sc.close();
    }
    
    private static String  concate(String s1, String s2) {
        String s3 = s1.concat(s2);
        return s3;
    }
}
