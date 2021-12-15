package collectionSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Vector;

public class Case1 {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();    // 1.  sort() supports string class.
        al.add("Peacock");
        al.add("Ashish");
        al.add("zebra");
        al.add("Test");
        al.add("java");
        
        System.out.println("ArrayList befor Sorting : " + al);
        Collections.sort(al);
        System.out.println("ArrayList After Sorting :" + al);
        
        LinkedList<Integer> l = new LinkedList<Integer>();  //1.  sort() supports wrapper classes.
        l.add(10);
        l.add(2);
        l.add(6);
        l.add(22);
        l.add(5);
        System.out.println("Linked list before sorting :"+l);
        Collections.sort(l);
        System.out.println("Linked List after sorting :"+l);
        
        
        //Case 2 : Sorting does not support hetrogeneous type data.
        
        Vector v = new Vector();
        v.add("Ashish");
        v.add(10);
       // Collections.sort(v);    // Exception occus ClassCastException as sort does not support hetrogeneous type data.
        
        
        // Case 3: NullPointer Exception in sorting
        ArrayList a2 = new ArrayList();
        a2.add("ashish");
        a2.add(10);
        a2.add(null);
        Collections.sort(a2);   // here we will face Nullpointer Exception as we are comparing any object with NUll.
    }

}
