package Cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class Case2_ArrayListIteratorCursor {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("ArrayList 1");
        al.add("ArrayList 2");
        al.add("ArrayList 3");
        al.add("ArrayList 4");
        
        // Read the data by using Iterator : normal version
        Iterator it = al.iterator();
        while(it.hasNext()){
            String s = (String)it.next();
            System.out.println(s);
        }
        System.out.println("\n");
        // Read the data by using Iterator : normal version
        Iterator<String> it1 = al.iterator();
        while(it1.hasNext()){         // hasnext() to check the data
            String s1 = it1.next();     // next() to read the data
            System.out.println(s1);
        }
    }
}
