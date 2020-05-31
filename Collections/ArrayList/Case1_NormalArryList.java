package arrayList;

import java.util.ArrayList;

public class Case1_NormalArryList {

    /*
     1. ArrayList are Hetrogenious
     2. Array List allows, Duplicate object , null value.
     Every collection class automatically calling Autoboxing concept, in below example we used primitive data 10, 10.5, 'ashsh,
     collection internally automatically covert that data into object this automatic conversion is called autoboxing.
     */
    public static void main(String[] args) {
        
        // Java 1.5 version Autoboxing is Introduced so we can write the code directly.
            ArrayList al = new ArrayList();
            al.add(10);
            al.add(10.5);
            al.add("ashish");
            al.add('a');
            al.add(null);
            al.add(10);
            System.out.println(al);
            System.out.println(al.toString());
            
        // Java 1.4 version when there is no autoboxing so we do conversion as below:
            ArrayList a2= new ArrayList();
            a2.add(Integer.valueOf(10));
            a2.add(Double.valueOf(10.5));
            a2.add(Character.valueOf('a'));
            System.out.println(a2);
            System.out.println(a2.toString());
            
    }

}
