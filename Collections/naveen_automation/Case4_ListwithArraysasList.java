package naveen_automation;

import java.util.ArrayList;
import java.util.Arrays;

public class Case4_ListwithArraysasList {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(10,20,30,40));
        System.out.println(al);
        
        ArrayList<String> al1 = new ArrayList<String>(Arrays.asList("Java","Python","Ruby","Java Scriot"));
        System.out.println(al1);
    }

}
