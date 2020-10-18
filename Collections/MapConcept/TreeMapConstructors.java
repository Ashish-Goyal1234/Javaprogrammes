package MapConcept;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapConstructors {

    public static void main(String[] args) {
            TreeMap<Integer, String> sm = new TreeMap<Integer, String>();
            sm.put(1, "ratan");
            sm.put(20, "anu");
            sm.put(40, "durga");
            sm.put(10, "sravya");
            sm.put(2, "ratan");
            sm.put(30, "ratan");
            System.out.println(sm);
            
            SortedMap<Integer, String> sm1 = sm.subMap(2, 30);
            TreeMap<Integer, String> t = new TreeMap<Integer, String>(sm1);
            System.out.println(t);    // {2=ratan, 10=sravya, 20=anu}
            
            SortedMap<Integer, String> sm2 = sm.tailMap(20);
            TreeMap<Integer, String> t1 = new TreeMap<Integer, String>(sm2);
            System.out.println(t1);    //{20=anu, 30=ratan, 40=durga}
            
            SortedMap<Integer, String> sm3  = sm.headMap(30);
            TreeMap<Integer, String> t2 = new TreeMap<Integer, String>(sm3);
            System.out.println(t2);    // {1=ratan, 2=ratan, 10=sravya, 20=anu}

            
    }

}
