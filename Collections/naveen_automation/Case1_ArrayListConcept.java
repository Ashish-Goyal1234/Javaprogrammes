package naveen_automation;

import java.util.ArrayList;

public class Case1_ArrayListConcept {

    public static void main(String[] args) {
        ArrayList<Object> al = new ArrayList<Object>();
        al.add(100);
        al.add("Test");
        al.add(12.33);
        al.add(true);
        System.out.println(al);
        System.out.println("get value on index 1 :" + al.get(1));
        System.out.println(al.size());   // get size of arraylist
        System.out.println("Print Lowest Index  : " + 0);
        System.out.println("Print Higest Index  : " + (al.size()-1));
    }

}
