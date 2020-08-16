package vectorClass;

import java.util.ArrayList;
import java.util.Vector;

public class Case1 {
/*
 *  1. Vector is having same properties as arraylist.
 *  2. Difference between arraylist and vector is 
 *      "Arraylist" is Non-synchronized.   - Means have better performance, but not thread safe. (Multiple threads can access at a time)
 *      "Vector" is synchronized - Do not have better performance, but its thread safe (Only ) thread can access at a time.
 */
    public static void main(String[] args) {
        
        //1.  Check the default capacity / default constructor.
        Vector<String> v = new Vector<String>();
        v.add("Value 1");
        v.add("Value 2");
        v.add("value 3");
        v.add("value 4");
        System.out.println(v);
        System.out.println("To check the Default capacity of vector and the default capacity of vector is : " + v.capacity());
        
        //2. Assigning user defined capacity
        
       Vector<String> v1 = new Vector<String>(2);
       System.out.println("Check the initial capacity :" + v1.capacity());
       v1.add("Value 1 of v1");
       v1.add("Value 2 of v2");
       v1.add("value 3 of v3");
       v1.add("value 4 of v4");
       System.out.println(v1);
       System.out.println("Check the capacity after adding more than 2 values :" + v1.capacity()); // Capacity is increased by double of given capacity value in cons.
       
       
       //3. Dont want caapity would be increased by double i want to increase capacity by my given value
        Vector<String> v2 = new Vector<String>(2,8);   // Assigned initial capacity as '2' and after that capacity will get icrease by +8
        System.out.println("Initial capacity"+ v2.capacity());
        v2.add("value v1 of v2");
        v2.add("value v2 of v2");
        v2.add("value v3 of v2");
        v2.add("value v4 of v2");
        System.out.println(v2);
        System.out.println("Capacity cout increment after initial capacity : "+ v2.capacity());
        
        
        //4. Adding collection data into another collection
        /*
         * 1. We can add any collection data into any collection.
         * 2. We can add vector to collection.
         * 3. We can add collection to vector.
         */
        
        ArrayList<String> al = new ArrayList<String>();
        al.add("String 1");
        al.add("String 2");
        al.add("String 3");
        al.add("String 4");
        
        Vector<String> v3 = new Vector<String>(al);
        v3.add("Vector value 1");
        v3.add("Vector value 2");
        v3.add("Vector value 3");
        v3.add("Vector value 4");
        
        System.out.println("values in vector is displayed as (Arraylist + vector) : "+ v3);
        
    }

}
