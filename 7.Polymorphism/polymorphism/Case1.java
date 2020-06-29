package polymorphism;


public class Case1 {
    void m1(int a){                             // overloaded method same method name with different parameter list.
        System.out.println(a+a);
    }
    
    void m1(int a, int b){                      // overloaded method same method name with different parameter list.
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        Case1 t = new Case1();
        t.m1(10);
        t.m1(10,20);
    }

}
/*
Cases 1 :
    void m1(int a)      // Invalid overloaded method
    void m1(int b)     // Invalid overloaded method
    
Case 2:
    void m1(int a, char ch)             // Valid overloaded method
    void m1(char ch, int a)             // Valid overloaded method
    
Case 3:
    int m1(char ch)             // Valid overloaded method
    String m1(int a)            // Valid overloaded method
*/