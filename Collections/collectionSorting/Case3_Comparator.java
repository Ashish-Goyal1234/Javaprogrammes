package collectionSorting;

import java.util.ArrayList;
import java.util.Collections;

public class Case3_Comparator {

    public static void main(String[] args) {
        
        ArrayList<Emp> al = new ArrayList<Emp>();
        al.add(new Emp(3003, 30, "Ashish"));
        al.add(new Emp(1001, 10, "PQR"));
        al.add(new Emp(4004, 40, "XYZ"));
        al.add(new Emp(2002, 20, "LMN"));
        
        Collections.sort(al, new EmpIDComparator());
        
        for(Emp e : al) {
            System.out.println(e.empId + e.sal + e.name);
        }
    }

}
