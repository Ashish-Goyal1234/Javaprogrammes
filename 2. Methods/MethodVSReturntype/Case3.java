package MethodVSReturntype;


public class Case3 {

    Case3 m1(){
        System.out.println("M1 method");
        Case3 t = new Case3();
        return t;
        // return new Case3();
    }
    
    Case3 m2(){
        System.out.println("M2 method");
        return this;
    }
    public static void main(String[] args) {
        Case3 c = new Case3();
       
        Case3 c1 = c.m1(); // here we stored m1() value in Case3  because m1() is return Case3 object value.
        System.out.println(c1);
        
        Case3 c2 = c.m2(); // here we stored m2() value in Case3  because m2() is return Case3 object value.
        System.out.println(c2);
    }
}