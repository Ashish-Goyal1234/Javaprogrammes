package NestedClasses;

                 
public class Case2_DeclaringmainmethodInOuterClass {
    int a = 10,  b=20;
    void m1(){
        System.out.println("Outer class m1()");
    }
        class Inner1{
            int x = 100, y=20;
            void m2(int i, int j){
                System.out.println("Inner class m2()");
                System.out.println(a+b);
                System.out.println(x+y);
                System.out.println(i+j);
            }
        }
           
        public static void main(String[] args){
            new Case2_DeclaringmainmethodInOuterClass().new Inner1().m2(1000, 2000);
        }
}

