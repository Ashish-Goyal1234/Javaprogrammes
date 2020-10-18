package Set_classes;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetMethods {

    public static void main(String[] args) {
            
        
        TreeSet<Integer> t = new TreeSet<Integer>();
        for(int i=1;i<=10;i++){
            t.add(i);                                           // o/p : 1,2,3,4,5,6,7,8,9,10
        }
        System.out.println(t);
        
        SortedSet<Integer> s1 = t.subSet(3, 7);      //O/P: 3,4,5,6 and Its Retuen type is sortedSet<Integer>.
        System.out.println(s1);  // Valid
        
        TreeSet<Integer> t1 = new TreeSet<Integer>(s1);            // Created new Tree set
        System.out.println(t1);                                // o/p : 3,4,5,6
        
        
        SortedSet<Integer> s2 = t.tailSet(4);
        System.out.println(s2);                                 // 4,5,6,7,8,9,10
        
        TreeSet<Integer> t2 = new TreeSet<Integer>(s2);                 // Created new Tree set
        System.out.println(t2);                                // 4,5,6,7,8,9,10
        
        SortedSet<Integer> s3 = t.headSet(6);
        System.out.println(s3);                                 // 1,2,3,4,5
        
        TreeSet<Integer> t3 = new TreeSet<Integer>(s3);                 // Created new Tree set
        System.out.println(t3);                                 // 1,2,3,4,5
        
        
        
        

    }

}
