package StringsExcerciseW3Resource;
import java.util.Scanner;

// Write a Java program to compare a given string to the specified string buffer

public class Compare_String_to_String_Buffer {

    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter String 1 :");
   StringBuffer string1   =  new StringBuffer(sc.nextLine());
   System.out.println("Enter String 2");
   StringBuffer String2  =new StringBuffer(sc.nextLine());
           
   if(string1.toString().equalsIgnoreCase(String2.toString())){   // Need to write equals because of refernce compariin
       System.out.println("Equals");
   }else{
       System.out.println("No equals");
   }
   sc.close();        
    }
}
