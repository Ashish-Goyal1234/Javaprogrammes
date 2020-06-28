package Variables;


public class Case4_InstanceVariable {
 
    // Variables declared inside the class but outside the method are called Instance method.
    int a =10;  // Instance variable
    int b =20; // Instance variable
    
    public static void main(String[] args) {   // Static method
        // Static Area
        Case4_InstanceVariable t = new Case4_InstanceVariable();
        System.out.println("Static method : " + t.a);   // Different area access by object
        System.out.println("Static method : "+ t.b);
        t.m1();
    }
    
    void m1() {  // Instance Method
        // Instance Area
        System.out.println("Instance method : " + a);  // Same area access directly.
        System.out.println("Instance method : " + b);
    }
    
// Scope of the variable : Able to access inside the class all methods / constructors / blocks able to access.
}
