package Cursors;

import java.util.Enumeration;
import java.util.Vector;
/*
 * Enumeration is applied to only Legacy classes (Classes which are introduced in 1.0 version e.g Vector class).
 
    1. Enumeration Introduced in 1.0 version.
    2. By using this cursor we can read the data from only legacy classes (the classes which are introduced in 1.0 version).
    3. This is not a universal cursor.
    4. Get enumeration object by using element().
    5. It uses hasmore() : to check data is available or not  and next(): to read the data elements.
    6. It is doing only read operations.
    7. We can read the data by using forward direction.
    8. Enumeration is interface.
    9. It supports normal and generic type.
    
     Vector and Arraylist are the same, having the same properties there is only 1 difference: arraylist methods are non synchronized but vector methods are synchronized.
Synchronized : 
Only 1 thread can access so it is thread safe but performance can reduce.
Not Synchronized : 
        Multiple threads can access it so it is not thread safe but performance is increase.


 */
public class Case1_EnumerationVectorClass {

    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();
        v.add("Test 1");
        v.add("Test 2");
        v.add("Test 3");
        v.add("Test 4");
        
        // Read the data by using Enumeration : normal version
        Enumeration e = v.elements();
        while(e.hasMoreElements()){     // hasMoreElements is used to check the data
           String s =  (String)e.nextElement();                    // nextElement()is used to read the data
           System.out.println(s);
        }
        System.out.println("\n");
        // Read the data by using Enumeration : geenric version
        Enumeration<String> e1 = v.elements();
        while(e1.hasMoreElements()) {
            String s1 = e1.nextElement();
            System.out.println( s1);
        }
    }

}
