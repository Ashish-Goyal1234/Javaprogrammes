package MapConcept;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMApconcept {

    public static void main(String[] args) {
        HashMap<Integer, String> h = new HashMap<Integer, String>();
        h.put(111, "Ratan");
        h.put(222, "anu");
        h.put(444, "durga");
        h.put(333, "sravya");
        h.put(666, "sravya");
        
        System.out.println(h);    // Insertion order is not preserved.
       
        Set<Integer> s = h.keySet();   // To get Set values and return type is set.
        System.out.println(s);
       
        Collection<String> c = h.values();                     // to get values and return type is collection.
        System.out.println(c);
   
        Set<Entry<Integer, String>> e =  h.entrySet();    // Used to get total Key,values also called as entry set values and return type is set.
           for(Entry<Integer, String> e1 :e){
               System.out.println(e1.getKey() + " " + e1.getValue());
           }
    }

}
