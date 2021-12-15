package naveen_automation;

import java.util.HashMap;
import java.util.HashSet;

public class Case11_Compare2DifferntHashMap {

    public static void main(String[] args) {
            HashMap<Integer, String> map1 = new HashMap<Integer, String>();
            map1.put(1, "A");
            map1.put(2, "B");
            map1.put(3, "C");
            
            HashMap<Integer, String> map2 = new HashMap<Integer, String>();
            map2.put(3, "C");
            map2.put(1, "A"); 
            map2.put(2, "B");
            
            HashMap<Integer, String> map3 = new HashMap<Integer, String>();
            map3.put(3, "C");
            map3.put(1, "A"); 
            map3.put(2, "B");
            map3.put(3, "D");
            
            // 1. Compare 2 hashmap on the basis of key- value : Use equals method.
           System.out.println(map1.equals(map2));  // true
           System.out.println(map1.equals(map3)); //false
           
           // 2. Compare hashmap for same Keys : Keyset();
           System.out.println(map1.keySet().equals(map2.keySet()));   // true
           System.out.println(map1.keySet().equals(map2.keySet()));  // true
           
           //3. Find out the extra key.
           HashMap<Integer, String> map4 = new HashMap<Integer, String>();
           map4.put(1, "A");
           map4.put(2, "B");
           map4.put(3, "C");
           map4.put(4, "D");
           
           HashSet <Integer> combineKeys = new HashSet<Integer>(map1.keySet());  // Added Map 1 keys
           combineKeys.addAll(map4.keySet());   // Added map4 keys.
           combineKeys.removeAll(map1.keySet());  // Removing Map 1 keys so that we get the extra keySet which is present in map4
           System.out.println(combineKeys);
            
           // 4. Compare maps by values.
    }

}
