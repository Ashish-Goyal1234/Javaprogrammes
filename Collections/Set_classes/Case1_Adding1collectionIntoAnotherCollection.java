package Set_classes;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Case1_Adding1collectionIntoAnotherCollection {

    public static void main(String[] args) {
            /*
             * a. cons            : only 1 collection to another.
             * b. addAll()      : Multiple collection to another.
             */
        LinkedHashSet<String> h1 = new LinkedHashSet<String>();
        h1.add("ratan");
        h1.add("anu");
        
        HashSet<String> h2 = new HashSet<String>(h1);
        h2.add("aaa");
        System.out.println(h2);
        
   System.out.println("***********Add All Concept In Java************88");     
        LinkedHashSet<String> h11 = new LinkedHashSet<String>();
        h11.add("Test1");
        h11.add("Test2");
        
        LinkedHashSet<String> h22 = new LinkedHashSet<String>();
        h22.add("Test3");
        h22.add("Test4");
        
        LinkedHashSet<String> h33 = new LinkedHashSet<String>();
        h33.add("Test5");
        h33.add("Test6");
        h33.addAll(h11);
        h33.addAll(h22);
        System.out.println(h33);
        
        
    }

}
