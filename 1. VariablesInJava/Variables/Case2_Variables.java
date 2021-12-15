package Variables;


public class Case2_Variables {

   // Scope of the variable is only within methods / constructor / blocks.
    
    void m1() {
        int a = 10;
        System.out.println(a);  // possible
    }
    void m2(){
        System.out.println(a); // not possible.
    }

    // memory allocated when method starts and memory is released when method is completed.
    // LOcal variables are stores in Stack memeory.
}
