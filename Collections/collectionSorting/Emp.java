
package collectionSorting;

public class Emp implements Comparable{

    int empId;
    int sal;
    String name;

    Emp(int empId, int sal, String name) {
        this.empId = empId;
        this.sal= sal;
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {             // Sorting based on name
        Emp e = (Emp) o;
           return name.compareTo(e.name);
    }

  /*  @Override                                         // Sorting based on EmpID
    public int compareTo(Object o) {
      Emp e = (Emp) o ;
        if(empId==e.empId){
            return 0;     
       }else if(empId>e.empId){
           return 1;
       }else{
           return -1;
       }
    } */
    
    
    
}
