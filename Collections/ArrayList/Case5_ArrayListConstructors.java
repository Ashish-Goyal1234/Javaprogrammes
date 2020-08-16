package arrayList;

import java.util.ArrayList;

public class Case5_ArrayListConstructors {

    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<Integer>();  // upto now we are using default constructor
      //  Default capacity od arraylist : 10 once it reaches max capacity
        // new capacity  : old capacity *3 /2+1   = 16
        a1.add(10);
        a1.add(20);
        a1.add(30);
        
        // new ArrayList(20);
        // new capacity  : old capacity *3 /2+1   = 31
        ArrayList<Integer> a2 = new ArrayList<Integer>(a1);  // Adding one constructor into another
        a2.add(100);
        a2.add(200);
        
        System.out.println(a2);
    }

}
