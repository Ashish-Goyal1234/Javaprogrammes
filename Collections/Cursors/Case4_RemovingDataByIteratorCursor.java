package Cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class Case4_RemovingDataByIteratorCursor {

    public static void main(String[] args) {
            ArrayList<String> al = new ArrayList<String>();
            al.add("Ashish");
            al.add("Anisha");
            al.add("Test1 data");
            al.add("Test 2 data");
            
            Iterator<String> itr = al.iterator();
            while(itr.hasNext()) {
                String s = itr.next();
                if(s.equals("Test1 data")){
                    itr.remove();
                }
            }
            System.out.println(al);
    }

}
