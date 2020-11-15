package InterviewProgrammes;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesFromString {

    public static void main(String[] args) {
                String s= "this string contains two two";
                String str1[] = s.split(" ");
                
                
              HashSet<String> hs = new HashSet<String>(Arrays.asList(str1));
              System.out.println(hs.toString());
    }
}
