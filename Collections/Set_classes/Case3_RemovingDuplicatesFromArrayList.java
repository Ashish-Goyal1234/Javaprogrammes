package Set_classes;

import java.util.ArrayList;
import java.util.HashSet;

public class Case3_RemovingDuplicatesFromArrayList {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("ratan");
        al.add("anu");
        al.add("ratan");
        
        HashSet<String> s = new HashSet<String>(al);
        System.out.println(s);
    }

}
