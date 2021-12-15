package InterviewProgrammes;

import java.util.HashSet;
import java.util.Set;

public class Prog21_RemoveDuplicatesInArraysUsingCollectionInteger {
    public static void main(String[] args) {
        int numbers[] = {1,2,3,3,4,4,5,2,6};
        Set<Integer> num = new HashSet<Integer>();
        for(int ListNumbers : numbers){
            if(num.add(ListNumbers)){
                System.out.println("Unique Numbers  : " +  ListNumbers);
            }
        }
    }
}
