package InterviewProgrammes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindGreatestAndSmallestUsingArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(8,5,1,2,3,12,9));
       Collections.sort(al);
       System.out.println("Greatest Number :" + (al.get(al.size()-1)));
       System.out.println("Smallest Number :" + (al.get(0)));
    }
}
