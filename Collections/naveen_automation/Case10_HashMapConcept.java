package naveen_automation;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

/*
         1. There is no order or indexing while storing the data which is there in arrayList.
         2. It stores the value in Key, value format.
         3. Keys cannot be duplicate if written duplicate it will override but will not throw error.
         4. Can store N number of null "Values" but only can store only one null "key".
         5. Hashmap is not thread safe, It is unSynchronized
 */
public class Case10_HashMapConcept {

    public static void main(String[] args) {
            HashMap <String, String> capitalMap = new HashMap<String, String>();
            capitalMap.put("India", "Delhi");
            capitalMap.put("USA", "Washington DC");
            capitalMap.put("UK", "London");
            capitalMap.put("UK", "London11");  // Same key It will not generate ay error but it will override the key with this key.
            capitalMap.put(null, "Berlin");
            capitalMap.put(null, "LA");
            capitalMap.put("Russia", null);
            capitalMap.put("France", null);
            
            System.out.println(capitalMap);   // hashMap is non synchronized.
            System.out.println(capitalMap.get("USA"));
            
           System.out.println("****************** Itearating value in hashMap  using Key set *************************");
           Iterator<String> keyset = capitalMap.keySet().iterator();
           while(keyset.hasNext()){
               String key = keyset.next();
               String value = capitalMap.get(key);
               
               System.out.println("Key : " + key + ", Value : "+ value);
               
               System.out.println("************ Iterating values in hashmap using entry Set ***************");
               Iterator<Entry<String, String>> entryset = capitalMap.entrySet().iterator();
               while(entryset.hasNext()){
                  Entry<String, String> setValues =  entryset.next();
                  System.out.println(setValues.getKey() + " : "+ setValues.getValue());
               }
               
               System.out.println("************ Printing values  ***************");
               Collection<String> values = capitalMap.values();
               System.out.println(values);
               
              
               
           }
    }

}
