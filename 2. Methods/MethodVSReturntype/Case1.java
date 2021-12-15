package MethodVSReturntype;


public class Case1 {

    int m1(){
        System.out.println("M1 method");
        return 10;
    }
    
    float m2(){
        System.out.println("M2 method");
        return 10.5f;
    }
    
    static char m3() {
        System.out.println("m3 method");
        return 'a';
    }
    public static void main(String[] args) {
        Case1 t = new Case1(); 
        int x = t.m1();
        System.out.println(x);
        
        float y = t.m2();
        System.out.println(y);
        
        char ch = Case1.m3();
        System.out.println(ch);
        
    }

}
