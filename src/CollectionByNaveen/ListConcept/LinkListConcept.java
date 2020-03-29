package CollectionByNaveen.ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkListConcept {

    public static void main(String[] args) {

        
        LinkedList<String> ll = new LinkedList<String>();
        
        ll.add("NAme 1");
        ll.add("NAme 2");
        ll.add("NAme 3");
        ll.add("NAme 4");
        
        System.out.println("Contents : "+ ll);
        
        ll.addFirst("Ashish");
        ll.addLast("Goyal");
        
        System.out.println("Contents : "+ ll);
        
        String s1 = ll.get(1);
        System.out.println("Contents : "+ s1);
        
        ll.set(1, "Edited");
        String s2 = ll.get(1);
        System.out.println("Contents : "+ s2);

        
        ll.removeFirst();
        ll.removeLast();
        System.out.println("Contents : "+ ll);
        
        ll.remove(2);
        System.out.println("Contents : "+ ll);

        
        //how to print all values of LinkedList:
        // 1. ForLoop.
        
        for(int n=0; n<ll.size(); n++){
            System.out.println("Using for loop"+ ll.get(n));
        }
        //2. Adv For Loop
        
        System.out.println("Using Adv for loop");
        for(String str :ll){
            System.out.println(str);

        }
        
        //3. Iterator
        System.out.println("By Using Iterator");
        Iterator<String> it = ll.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            
        }
        
        //4. while Loop
        System.out.println("By Using While Loop");
        
        int num=0;
        while(ll.size()>num){
            System.out.println(ll.get(num));
            num++;

            
        }



    }

}
