package MapConcept;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapWithComparable {

    public static void main(String[] args) {
        TreeMap<Integer, String> t = new TreeMap<Integer, String>();
        t.put(1, "ratan");
        t.put(20, "anu");
        t.put(5, "durga");
        t.put(3, "sravya");
        
        System.out.println(t);   // By default it prints data in Ascending order, Muy requirement is to print data in descending order so I wil create my own comparator.
  System.out.println("*********Printing data in Descending order for Integer type object***************");
        TreeMap<Integer, String> t1 = new TreeMap<Integer, String>(new MycompInteger());
        t1.put(1, "ratan");
        t1.put(20, "anu");
        t1.put(5, "durga");
        t1.put(3, "sravya");
        
        System.out.println(t1); 
       // Sorting for values not possible because sorting can be done for Key type only not value type.
    }
    
  
}


class MycompInteger implements Comparator<Integer>{

    @Override
    public int compare(Integer i1, Integer i2) {
        return - i1.compareTo(i2);     // I have used compareTo() because i1 is of Integer type, In product It use ==,<> because product contains value in int type.
    }
}