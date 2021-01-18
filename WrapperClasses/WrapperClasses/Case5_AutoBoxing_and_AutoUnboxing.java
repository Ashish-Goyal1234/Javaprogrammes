package WrapperClasses;

import java.util.ArrayList;

public class Case5_AutoBoxing_and_AutoUnboxing {

    public static void main(String[] args) {
        //Autoboxing : Automatic conversion of primitive to wrapper object.
        Integer i = 100;
        System.out.println(i);
        
        //Auto Unboxing : Automatic conversion of wrapper object to primitive.
        
        int x = new Integer(200);
        System.out.println(x);
        
        // Java 1.4 : no Autoboxing
        ArrayList<Object> a1 = new ArrayList<Object>();
        a1.add(new Integer(10));
        a1.add(new Double(10.5));
        a1.add(new Character('c'));
        System.out.println(a1);
        
        // Java 1.5 : with AutoBoxing
        ArrayList<Object> a = new ArrayList<Object>();
        a.add(10);   //internally uses valueOf(). 
        a.add(10.5);
        a.add('c');
        System.out.println(a);
    }

}
