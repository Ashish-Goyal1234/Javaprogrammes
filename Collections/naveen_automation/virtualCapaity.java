
package naveen_automation;

import java.util.ArrayList;

public class virtualCapaity {

    public static void main(String[] args) {
        ArrayList<Object> al = new ArrayList<Object>();   // Default virtual capacity is "10";  We can check virtual capacity by debussing only.
        al.add("test");
        al.add(100);
        System.out.println(al);     // Remianing "8" index values will print as NULL.
        
        
        ArrayList<Object> al1 = new ArrayList<Object>(20);  // I have provide my capacity as "20"
        al1.add("test122");
        al1.add(200);
        
        System.out.println(al1);   // Remaing "18" index values will print as NULL.
    }

}
