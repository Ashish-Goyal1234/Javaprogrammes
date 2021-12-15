
package naveen_automation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Case9_CompareTwoArrayList {

    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F"));
        ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));
        ArrayList<String> l3 = new ArrayList<String>(Arrays.asList("B", "A", "E", "C", "D"));
        
        System.out.println(l1.equals(l2));  // false : because in l1 "F" present and in l2 "E" present.
        System.out.println(l2.equals(l3));  // false : even all elements are present, elements are not displayed in sorted order.
        Collections.sort(l3);
        Collections.sort(l2);
        System.out.println(l2.equals(l3)); // True : because now elements are sorted and both list is having common elements.
    }

}
