package StringsExcerciseW3Resource;

import java.util.Scanner;

// Write a Java program to get the character at the given index within the String

public class Get_Character_At_The_Given_index_within_the_String {
    
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the original String :");
           String originalString = sc.nextLine();
           System.out.println("Enter the Character index you wanted to fext from string");
          int index = sc.nextInt();
           System.out.println(getCharacters(originalString, index));
           sc.close();
    }
    
    private static char getCharacters (String  s, int index){
       char ch  = s.charAt(index);
        return ch;
    }

}
