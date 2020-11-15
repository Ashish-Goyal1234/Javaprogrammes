package naveen_automation;

import java.util.ArrayList;
import java.util.Arrays;

public class Case7_ConvertingArrayListIntoArray {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Tom");
        names.add("Peter");
        names.add("Steve");
        names.add("Lisa");
        
        Object arr[] = names.toArray();
        System.out.println(Arrays.toString(arr));
        
        for(Object o : names){
            System.out.println(o);
        }
        
    }

}
