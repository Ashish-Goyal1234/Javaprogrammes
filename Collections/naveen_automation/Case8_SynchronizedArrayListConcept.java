package naveen_automation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/*
 * 1. By Default ArrayList are Non synchronized.
 * 2. To provide arrayList synchronization we have 2 methods :
 *      - collections.synchronizedList
 *      - copyOnWriteArrayList
 */
public class Case8_SynchronizedArrayListConcept {
    public static void main(String[] args) {
       
      // 1. : collection.SynchronizedList : Creates a new synchronized arrayList.
        List<String> namesList = Collections.synchronizedList(new ArrayList<String>());
       namesList.add("Naveen");
       namesList.add("Lisa");
       namesList.add("peter");
       System.out.println("Non Synch arrayList : " + namesList);   // Non synchronized arrayList
       
       synchronized (namesList){    // Synchronized arrayLIst
           Iterator<String> it = namesList.iterator();
           while(it.hasNext()){
             System.out.println(it.next());  
           }
       }
       
       System.out.println("***********CopyOnWriteArrayList**************");
       //2. : copyOnWriteArrayList -- class : Thread safe / synchronized already
       CopyOnWriteArrayList<String> empNames = new CopyOnWriteArrayList<>();
       empNames.add("Tom");
       empNames.add("Steve");
       empNames.add("Lisa");
       
       Iterator<String> itr = empNames.iterator();
       while(itr.hasNext()){
           System.out.println(itr.next());   // Synchronized arrayList
       }
    }
}
