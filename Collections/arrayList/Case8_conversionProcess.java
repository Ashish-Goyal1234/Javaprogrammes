package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Case8_conversionProcess {

    public static void main(String[] args) {

            // 1. Converting Arrays ----> Collection.
            String[] s = {"aaa", "bbb","ccc"};
            
            ArrayList<String> al = new ArrayList<String>(Arrays.asList(s));
            al.add("Test1");
            al.add("Test 2");
            
            System.out.println("Updated Size of ArrayList : " + al.size());
            System.out.println("Values in ArrayList: " + al);
        
        //2. Converting generic Collections ----> Arrays
        
            ArrayList<String> a2 = new ArrayList<String>();
            a2.add("Value 1");
            a2.add("Value 2");
            
            String[] s1 = new String[a2.size()];
            a2.toArray(s1);
            for(String ss : s1){
                System.out.println(ss);
            }
            
       //3. Converting normal collection ----> Arrays [without generics]
            ArrayList a3 = new ArrayList();
            a3.add("Ashish");
            a3.add(10);
            
            Object[] o = a3.toArray();
            for(Object oo : o) {
                System.out.println(oo);
            }
       
    }

}
