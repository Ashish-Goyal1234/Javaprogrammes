package NestedClasses;

class outer{
    int a = 10; int b=20;
    private int k = 30, l=60;
        void m1(){
            System.out.println("Outer class m1()");
        }
        
        class Inner{
            int x = 100; int y =200;
            void m2(){
                System.out.println("Inner class m2()");
                System.out.println(x+y);
                System.out.println(a+b); //inner class can access the properties of outer class but outer class unable to access properties of inner class.
                    m1();
                    System.out.println(k+l);  // inner class can access outer class private properties also.
            }
        }
}

public class Case1_NormalInnerClass {

    public static void main(String[] args) {
        outer o =new outer();
        o.m1();
        
        outer.Inner i = o.new Inner();
        i.m2();
    }

}
