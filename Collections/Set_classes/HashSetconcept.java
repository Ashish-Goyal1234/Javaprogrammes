package Set_classes;

import java.util.HashSet;

public class HashSetconcept {
    
    // Insertion Order is Preserver in LinkedHash Set but Inserton Order is not Preserved in HashSet Just 1 difference is there between 2
        public static void main(String[] args) {
            HashSet<String> H = new HashSet<String>();
            H.add("ratan");
            H.add("anu");
            H.add("Durga");
            H.add("ratan");
            System.out.println(H);
            
            // Output will be Random as insertion order is not preserved.
            // above 2 times ratan is added so ratan will be printed only 1 time as duplicate is not allowed.
        
            HashSet<String> h1 = new HashSet<String> ();
            System.out.println(  h1.add("ratan"));   //true as data is inserted for first time
            System.out.println(  h1.add("ratan"));  //false as duplicate data is not allowed.
            System.out.println(  h1.add("ratan"));  //false as duplicate data is not allowed.
            System.out.println(  h1.add("ratan"));  //false as duplicate data is not allowed.
        } 

}
