package MapConcept;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapconcept {

    public static void main(String[] args) {
            LinkedHashMap<Emp, Student> ll = new LinkedHashMap<Emp, Student>();
            ll.put(new Emp(111, "aaa"), new Student(1, "pqr"));
            ll.put(new Emp(222, "bbb"), new Student(1, "xyz"));
            ll.put(new Emp(333, "ccc"), new Student(1, "lmn"));
   
 System.out.println("*********Keys*************");
            for(Emp e : ll.keySet()){
                    System.out.println(e.eid + " "+e.ename);
            }
 System.out.println("************Values*********");           
            for(Student s  : ll.values()){
                System.out.println(s.sid + " " +s.sname );
            }
 System.out.println("********Entry Set**************");
    
             for(Entry<Emp,Student> ee: ll.entrySet()) {
                     Emp e1 = ee.getKey();
                     System.out.println(e1.eid + " " + e1.ename);
                       Student s1 = ee.getValue();
                       System.out.println(s1.sid+" " + s1.sname );

 System.out.println("********Entry Set Using Iterator**************");  // Not Map Does not support any cursors we are printing the data in cusror using set as return type of entry set is set.
 
                        Set<Entry<Emp, Student>>ss =  ll.entrySet();
                        Iterator<Entry<Emp, Student>> itr1 = ss.iterator();
                        while(itr1.hasNext()){
                            Entry<Emp, Student> aa = itr1.next();
                            Emp e = aa.getKey();
                            System.out.println(e.eid +" "+ e.ename);
                            
                            Student s = aa.getValue();
                            System.out.println(s.sid+" "+s.sname);
                        }
                        
                   
                       
                 
             }
        }

}
