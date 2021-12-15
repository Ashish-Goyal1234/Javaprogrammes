package MapConcept;

import java.util.TreeMap;

public class TreeMapConcept {

    public static void main(String[] args) {
        
        // Sorting is always done based on keys but not values.
        
    System.out.println("********Sorting is done based on Keys (String type)************");
            TreeMap<String,Integer> t = new TreeMap<String, Integer>();
            t.put("Ratan", 111);
            t.put("Anu", 222);
            t.put("Durga", 111);
            t.put("Savya", 111);
            System.out.println(t);
            
    System.out.println("*******Sorting is done based on Keys (Integer Type)*************");
    
    TreeMap<Integer, String> t1 = new TreeMap<Integer, String>();
    t1.put(111, "Ratan");
    t1.put(333,"anu");
    t1.put(444, "durga");
    t1.put(222, "Sravya");
    System.out.println(t1);
            
     
            
    }

}
