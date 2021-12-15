package arrayList;

import java.util.ArrayList;
/*
 * There are some arrylist methods to make operations easy
 */
public class Case4_ArrayListMethods {

    public static void main(String[] args) {
            ArrayList al = new ArrayList();
                al.add(10);
                al.add(10.5);
                al.add("Ratan");
                al.add("Ashish");
                al.add(10);
                al.add(null);
                
                System.out.println(al);
                
                System.out.println(al.size());
                
                al.add(3, "durga");
                System.out.println(al);
                
                al.remove(2); // by using index
             //   al.remove(100);  // This will give AIOBE because 100 arrayList size is not there and still we trying to remove.
                al.remove("PQR");   // This name is not present in ArrayList still trying to remove it will just ignore without any error.
                al.remove("Ashish");
                System.out.println(al);
                
                al.set(1, "xxx");   // Set is used to replace the value.
                System.out.println(al);
                
                System.out.println(al.isEmpty());   //false
                al.clear(); // used to clear all the data.
                System.out.println(al);
                System.out.println(al.isEmpty());
               
    }
    

}
