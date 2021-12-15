package Cursors;

import java.util.ArrayList;
import java.util.ListIterator;

public class Case6_AddingANdRemovingObjectUsingListIterator {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Ashish");
        al.add("Anisha");
        al.add("Test 1");
        al.add("Test 2");
        
            ListIterator<String> lst = al.listIterator();
            lst.add("Test 3");
            while(lst.hasNext()){
              String s =  lst.next();
                if(s.equals("Test 1")){
                    lst.remove();
                }
                if(s.equals("Test 2")){
                    lst.set("Test Replace");
                }    
           }
            System.out.println(al);
    }

}
