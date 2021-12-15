package Set_classes;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetProvidingOwnComparator {

    public static void main(String[] args) {
        
        // By default sorting is done in Ascending order.
        TreeSet<String> t = new TreeSet<String>(new MyComparator());
        t.add("ratan");
        t.add("anu");
        t.add("durga");
        t.add("sravya");
        System.out.println(t);   
        
        /*
         *   1.  In below Example of Integer type(object type) I have created my own Comparatoe by comparing using compareTo().
         *   2. But while comparing ProductID while comparing as discussed in cursor cocept I need to compare the vales by >,==.< becuse productId is of int type.
         */         
        TreeSet<Integer> t1 = new TreeSet<Integer>(new MyComparatorInt());
        t1.add(10);
        t1.add(3);
        t1.add(7);
        t1.add(20);
        System.out.println(t1);   


        
        
        
    }
}


class MyComparator implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {
        return  - s1.compareTo(s2);   // Here I added '-' sign because now It will sort the list in Descending order
    }
}


class MyComparatorInt implements Comparator<Integer>{

    @Override
    public int compare(Integer i1, Integer i2) {
        return -i1.compareTo(i2);
    } 
}