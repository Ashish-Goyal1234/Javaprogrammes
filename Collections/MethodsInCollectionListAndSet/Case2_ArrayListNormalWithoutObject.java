package MethodsInCollectionListAndSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Case2_ArrayListNormalWithoutObject {

    public static void main(String[] args) {
            ArrayList<String> arrayList1 = new ArrayList<String>(Arrays.asList("Tom", "Peter", "Lisa", "Steve", "Tom", "Tom"));
            ArrayList<String> arrayList2 = new ArrayList<String>(Arrays.asList("India", "London", "Brazil", "New york"));
            ArrayList<String> arrayList3 = new ArrayList<String>(Arrays.asList("Peter", "Lisa", "Steve", "Tom", "Naveen", "Ashish"));
            
            System.out.println("**************** Add Methods *******************");
            System.out.println(arrayList1);
            arrayList1.add("Naveen");
            arrayList1.add(2, "Ashish");
          //  arrayList1.addAll(arrayList2);
            
            System.out.println("**************** ContainsMethods *******************");
            
            System.out.println("Is arrayList1 Contains India : " + arrayList1.contains("India"));
            System.out.println("Is arrayList1 contains all Elements of arrayList 2 : " + arrayList1.containsAll(arrayList2));
            
            System.out.println("**************** Equals Methods *******************");
            
           System.out.println("Is arrayList1 is equal arrayList2 without sorting : " +arrayList1.equals(arrayList3));
           Collections.sort(arrayList1);
           Collections.sort(arrayList3);
           System.out.println("Is arrayList1 is equal arrayList2 after sorting : " + arrayList1.equals(arrayList3));
           
           System.out.println("**************** get Methods / Index Of / isEmpty() *******************");

           System.out.println(arrayList1.get(3));        // Here I will get output as peter becuase I have sorted the collection in above step
           System.out.println( arrayList1.indexOf("Ashish"));
           System.out.println(arrayList1.isEmpty());

           System.out.println("**************** Remove Methods *******************");
           
         String s =  arrayList1.remove(3);
         System.out.println(s);
         System.out.println("Remove the name from index 3 :" + arrayList1);
         arrayList1.remove("TOM");
         System.out.println("Remove only First Occurance of name : " + arrayList1);
         arrayList1.removeAll(arrayList2);   // Used o remove arrayList element from other arrayList
        // arrayList1.retainAll(Collections.singleton("Tom") );
        // System.out.println("Retail all method to get TOM : " + arrayList1);
         
         System.out.println("**************** Converting arrayList to Arrays *******************");
             
        Object arr[] =  arrayList1.toArray();
     //   System.out.println(arr.toString()); // It will print class name@hashCode
        for(Object o : arr){
            System.out.println(o);
        }
        
        
         ArrayList<Integer> numbers  = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8, 9, 10));
         numbers.removeIf(num -> num % 2==0);
         System.out.println("If number % by 2 == 0 then remove : " + numbers);

           
           /* ArrayList<String> cloneObject = (ArrayList<String>) arrayList1.clone();
            System.out.println(cloneObject); */
    }

}
