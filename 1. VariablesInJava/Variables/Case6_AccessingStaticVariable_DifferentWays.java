package Variables;


public class Case6_AccessingStaticVariable_DifferentWays {

    static int a= 100;
    public static void main(String[] args) {
        // 3 ways to access :
        
        System.out.println(Case6_AccessingStaticVariable_DifferentWays.a);  // by using class name.
      
        System.out.println(a);   // Direct access if it is within the same package.
        
        Case6_AccessingStaticVariable_DifferentWays t = new Case6_AccessingStaticVariable_DifferentWays(); // by using refrence variable.
        System.out.println(t.a);
    }

}
