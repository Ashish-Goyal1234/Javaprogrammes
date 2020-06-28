package Methods;


public class Case2 {

    void m1(int a, char ch){
        System.out.println("m1 method");
        System.out.println(a);
        System.out.println(ch);
    }
    
    static void m2(String str, double d){
        System.out.println("m2 method");
        System.out.println(str);
        System.out.println(d);
    }
    
    public static void main(String[] args) {
        Case2 t = new Case2();
        t.m1(10, 'a');
        Case2.m2("ashish",10.5);
    }
}
