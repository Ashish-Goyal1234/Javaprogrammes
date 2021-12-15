
package naveen_automation;

import java.util.ArrayList;

public class Case2_virtualCapaity {

    public static void main(String[] args) {
        ArrayList<Object> al = new ArrayList<Object>();   // Default virtual capacity is "10";  We can check virtual capacity by debugging only.
        System.out.println(al.size()); 
        al.add("test");
        al.add(100);
        System.out.println(al.size());    // It will return the "Physical Capacity".
        System.out.println(al);     // Remianing "8" index values will print as NULL.
        
        
        ArrayList<Object> al1 = new ArrayList<Object>(20);  // I have provide my Virtual capacity as "20"
        System.out.println(al.size());   // Note : It will print only "Physical capacity" not Virtual capacity
        al1.add("test122");
        al1.add(200);
        
        System.out.println(al1);   // Remaing "18" index values will print as NULL.
    }

}
