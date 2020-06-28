package Methods;


public class Case1 {
    
    void m1(){
        System.out.println("m1 method");
    }
    
    static void m2(){
        System.out.println("m2 method");
    }

    public static void main(String[] args) {
        Case1 t = new Case1();
        t.m1();
        Case1.m2();
    }

}
