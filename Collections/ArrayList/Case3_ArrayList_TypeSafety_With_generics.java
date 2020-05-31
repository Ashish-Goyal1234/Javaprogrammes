package ArrayList;

import java.util.ArrayList;

// To provide type safety to collection use generics.
// collection allows hetrogeneious data but not recommended, then for every object we need to checktypacasting and type checking.
// collections generics only recommended.
// Arrays already store homeogenerious data and collection generics also strore homogenious data still,
    // recommended to use collection generics becuse collection are flexible w.r.t memeory and operations.

public class Case3_ArrayList_TypeSafety_With_generics {

        public static void main(String[] args) {
            ArrayList<Employee> al = new ArrayList<Employee>();
            al.add(new Employee(111,"Ratan"));
            al.add(new Employee(222, "Ashish"));
        
            for(Employee e : al){
                System.out.println(e.eid + " "+ e.ename);
            }
        Employee e1 = al.get(1);
                System.out.println(e1.eid + " " + e1.ename);
        }
}
