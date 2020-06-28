package Variables;

/*
         Static varibles memory is allocated when .class file is loaded.
         
         When we run class JVM performs 2 operatios:
         1. Loads .class file into memory.
         2. Calls main method to start execution.
         
         because .class file static variable memory is allocated, reason call the static variables and methods by using class name.
 */
public class Case5_Static_Varaible {
    
    // Variables declared inside the class but outside the method  with static modifier are called static varaiable.
    
    static int a = 10;
    static int b = 20;
   
    public static void main(String[] args) {
        System.out.println(Case5_Static_Varaible.a);  // acces by using class name
        System.out.println(Case5_Static_Varaible.b); // access by using class name.
        Case5_Static_Varaible t = new Case5_Static_Varaible();
        t.m1();
    }
    
    void m1(){
        System.out.println(Case5_Static_Varaible.a);  // acces by using class name
        System.out.println(Case5_Static_Varaible.b); // access by using class name.
    }
}
