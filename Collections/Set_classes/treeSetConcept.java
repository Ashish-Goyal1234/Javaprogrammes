package Set_classes;

import java.util.TreeSet;

public class treeSetConcept {

    public static void main(String[] args) {
        TreeSet<String> t = new TreeSet<String>();
        t.add("ratan");
        t.add("anu");
        t.add("durga");
        t.add("Sravya");
        System.out.println(t);
    
            TreeSet <Integer> i = new TreeSet<Integer>();
            i.add(10);
            i.add(2);
            i.add(5);
            i.add(3);
            i.add(20);
            System.out.println(i);
            
            TreeSet  t1 = new TreeSet();
            t1.add("ratan");
            t1.add(10);
            System.out.println(t1);   // Here we will face Class Cast Exception as Hetrgeneous data not allowed.
            
            TreeSet t2 = new TreeSet();
            t2.add(null);   // here we will face Null pointer Exception as null values are not allowed.

            

    }

}
