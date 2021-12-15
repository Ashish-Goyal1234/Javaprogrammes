package arrayList;

import java.util.ArrayList;
import arrayList.Employee;

public class Case7_MethodsInCollection {

    public static void main(String[] args) {
        Employee e1 = new Employee(111,"AAA");
        Employee e2 = new Employee(222,"BBB");
        Employee e3 = new Employee(333,"CCC");
        Employee e4 = new Employee(444,"DDD");
        
        ArrayList<Employee> a1 = new ArrayList<Employee>();
        a1.add(e1);
        a1.add(e2);
        ArrayList<Employee> a2 = new ArrayList<Employee>();
        a2.add(e3);
        a2.add(e4);
        a2.addAll(a1);
        
        System.out.println(a2.contains(e1));  // checks whether a2 contains e1 object if yes return true.
        System.out.println(a2.containsAll(a1));  // Checks whether a2 contains a1 collection object if yes returns true.
        a2.remove(e1);
        System.out.println(a2.contains(e1));  // Will return fails becaue we have remove e1 object.
        System.out.println(a2.containsAll(a1)); // will return failse because we have removed e1 object.
        
       
    
        
        a2.removeAll(a1);
        
       // System.out.println(a2);
        
         a2.retainAll(a1);    // gives all value from a1
         
        for(Employee e : a2){
            System.out.println(e.eid + " " + e.ename);
        }
    }

}
