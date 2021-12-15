package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Case9_SubList_And_SwapMethod {

    public static void main(String[] args) {
            /*
             1. Suppose I am having Arraylist from 1-100 and I wanted to create new Array list
             from 33 to 44 then this can be achive by subList   
             */
        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("Test 1");
        a1.add("Test 2");
        a1.add("Test 3");
        a1.add("Test 4");
        
        System.out.println("Before Swappinng : " + a1);
        Collections.swap(a1, 1, 3);   // Collections is a class contains some method to perform some operation.
        
        System.out.println("After Swappinng : " + a1);
        
        
        ArrayList<String> a2 = new ArrayList<String>(a1.subList(1, 3));  // It include starting index but exclude ending index
        a2.add("aaa");
        System.out.println("Sublist : " + a2);

        
    }

}
