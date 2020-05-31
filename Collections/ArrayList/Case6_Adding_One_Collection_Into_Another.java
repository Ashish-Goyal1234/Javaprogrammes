package arrayList;

import java.util.ArrayList;

public class Case6_Adding_One_Collection_Into_Another {

    public static void main(String[] args) {
        //Approach 1 : constructor : Adding only one collection into another.
            ArrayList<Integer> a1 = new ArrayList<Integer>();
            a1.add(10);
            a1.add(20);
           ArrayList<Integer> a2 = new ArrayList<Integer>(a1);
            a2.add(100);
            a2.add(200);
            
            System.out.println(a2);
            
    //Approch 2: by addALL() : to add more than one collectio into another.
    
            ArrayList<Integer> b1 = new ArrayList<Integer>();
            b1.add(10);
            b1.add(20);
           ArrayList<Integer> b2 = new ArrayList<Integer>();
            b2.add(100);
            b2.add(200);
            ArrayList<Integer> b3 = new ArrayList<Integer>();
            b3.add(1000);
            b3.add(2000);
            
            b3.addAll(b1);
            
            b3.addAll(b2);
            
            System.out.println(b3);
    }
            /*
                 Note :  add()     : Add only one object.
                             addAll() : Adds collection data
             */
}
