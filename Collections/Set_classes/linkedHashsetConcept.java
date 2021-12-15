package Set_classes;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedHashsetConcept {
            // Insertion Order is Preserver in LinkedHash Set but Inserton Order is not Preserved in HashSet Just 1 difference is there between 2
    public static void main(String[] args) {
        
        LinkedHashSet <Emp> lh = new LinkedHashSet<Emp> ();
        lh.add(new Emp(111, "ratan"));
        lh.add(new Emp(222, "anu"));
        lh.add(new Emp(333, "durga"));
        
        System.out.println(lh);   // If we Print directly then we get Classname@HasCode
        
        // S to print correct data we are using iteraror concept.
        Iterator<Emp> itr = lh.iterator();
        while(itr.hasNext()){
                    Emp empData = itr.next();
                    System.out.println("Emp id :" + empData.empId + " " + "Emp Name :" + empData.empName);
        }
        
    System.out.println("***********By Using for Each Loop**********");
        //by using for eachloop
        for(Emp e : lh){
            System.out.println(e.empId + " " +e.empName);
        }
        
    }

}
