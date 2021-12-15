package InterviewProgrammes;

import java.util.HashSet;
import java.util.Set;

public class Duplicate_CharacyersInStringUsingHashSetCollection {

    public static void main(String[] args) {
        String str = "beautiful beach";
        String splitteds[] = str.split("");
        Set<String> s = new HashSet<String>();
        for(String duplicate : splitteds){
            if(s.add(duplicate) == false){
                System.out.println(duplicate);
            }
        }
    }

}
