package MapConcept;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapAssignment {

    public static void main(String[] args) {
            LinkedHashMap <Integer, Product> p = new LinkedHashMap<Integer, Product>();
            p.put(10, new Product(111, "Pen"));
            p.put(13, new Product(122, "Book"));
            p.put(24, new Product(333, "Chair"));
            p.put(24, new Product(555, "Bottle"));
         
  System.out.println("***********Printing Key Value by using KeySet()******************");          
            Set<Integer> s = p.keySet();
            System.out.println(s);
            
 System.out.println("*****************Print values by using values()*************");
                 for(Product p1 :p.values()){
                     System.out.println(p1.pid +" "+p1.pName);
                 }
                 
 System.out.println("**********Printing product values Using Iterator and Removing Values using Iterator*********"); 
                 // Map Does not support Cursors but return type of entrySet is set.

                             Set<Entry<Integer, Product>>s1 = p.entrySet();
                             Iterator<Entry<Integer, Product>>itr  = s1.iterator();
                             while(itr.hasNext()){
                                 Entry<Integer, Product>prod = itr.next();
                                 Product pp = prod.getValue();
                                 Integer it = prod.getKey();
                                 if(pp.pid==111){
                                     itr.remove();
                                 }
                                 if(pp.pName.equals("bottle")){
                                     itr.remove();
                                 }   
                             }
                     // Pinting the data for thet usinh for loop
                             for(Entry<Integer, Product> kk : p.entrySet()) {
                                             Product p2  = kk.getValue();
                                             System.out.println(p2.pid+" "+p2.pName);
                             }
            
    }

}
