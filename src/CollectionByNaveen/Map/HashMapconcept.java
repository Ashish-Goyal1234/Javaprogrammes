package CollectionByNaveen.Map;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapconcept {

    public static void main(String[] args) {

        // HashMap is ac class implements Map Interface
        // Extends AbstractMap
        //1. It contains Only Unique element.
        //2. Stores the value in form of key and value pair
        //3. It may have one null key and multiple null values.
        //4. It maintains no order.
        //5. Hashmap is non synchronized (Hash map can be accessible by multiple threads.)
        //concurrent modification exception -- Fail Fast condition.
        
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "ABC");
     //   hm.put(1, "ABCf"); not will give error but replace the value.
        hm.put(null, "ddd");
        // hm.put(null, "fff"); this will not give error bu will replace the value.
        hm.put(5 , null);
        hm.put(2, "PQR");
        hm.put(3, "XYZ");
        hm.put(4, "LMN");
        
       System.out.println(hm.get(1));
       System.out.println(hm.get(4));
       
       for(Entry<Integer, String> m :hm.entrySet()){
           System.out.println(m.getKey() + " " + m.getValue());
       }
       
       System.out.println(hm);
       hm.remove(3);
       System.out.println(hm);
       
             HashMap<Integer, Employee1> emp = new HashMap<Integer, Employee1>();
             
             Employee1 e1 = new Employee1(1001 ,"Ashish","QA");
             Employee1 e2 = new Employee1(2001 ,"ABC","Dev");
             Employee1 e3 = new Employee1(3001 ,"PQR","Admin");
             
             emp.put(1, e1);
             emp.put(2, e2) ;
             emp.put(3, e3);
             
             for(Entry<Integer, Employee1> e : emp.entrySet()){
      Employee1 emp1 = e.getValue();
                 System.out.println( e.getKey());
                System.out.println(emp1.name+ emp1.dept+ emp1.id);
             }


       
       
    }

}
