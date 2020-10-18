package collectionSorting;

import java.util.Comparator;

public class EmpIDComparator implements Comparator<Emp> {

    @Override
    public int compare(Emp o1, Emp o2) {
        if(o1.empId==o2.empId){
            return 0;
        }else if(o1.empId > o2.empId){
            return 1;
        }else
            return -1;
    }


}
