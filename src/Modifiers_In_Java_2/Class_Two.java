
package Modifiers_In_Java_2; // This is Package 2

import Modifiers_In_Java.Class_One;

public class Class_Two extends Class_One {  //Direct subclass of Class_One So able to access its members.

    public static void main(String[] args) {
        //Class_One co = new Class_One(); // This will not work in case of protected member defined.
        
        Class_Two c2 = new Class_Two(); // Need to create object of child_two only to access class_one member.
        
        System.out.println(c2.num);  
    }
}
