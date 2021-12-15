package MapConcept;

import java.util.TreeMap;

public class TreeMapDataSorting {

    public static void main(String[] args) {    
        TreeMap<Integer, String> t = new TreeMap<Integer, String>();
        t.put(111, "aaa");
        t.put(222, "bbb");
        t.put(333, "ccc");
        
        TreeMap<Integer, String> t1 = new TreeMap<Integer, String>();
        t1.put(101, "a1");
        t1.put(102, "a2");
        t1.put(103, "a3");
        
        TreeMap<Integer, String> t2 = new TreeMap<Integer, String>();
        t2.put(110, "a10");
        t2.put(220, "a20");
        
        TreeMap<Integer, String> t3 = new TreeMap<Integer, String>(t);
        t3.put(1011, "Ashish");
        System.out.println(t3);
/*
        TreeMap<String, Integer> t4 = new TreeMap<String, Integer>(t);   // Here we will face compilation error because tree map generic version of objects not matching.
        System.out.println(t4);
*/
        TreeMap<Integer, String> t4 = new TreeMap<Integer, String>(t);
        t4.putAll(t1);
        t4.putAll(t2);
        t4.putAll(t3);
        System.out.println(t4);
        
    }

}
