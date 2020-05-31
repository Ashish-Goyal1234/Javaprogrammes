package NestedClasses;

    class Outer2{
        int a =10, b=20;
        void m1(){
            System.out.println("Outer Class m1()");
        }
            class inner2{
                int a = 100, b =200;
                void m2(int a, int b){
                   System.out.println(a+b);   //3000
                   System.out.println(this.a+this.b);   //300
                   System.out.println(Outer2.this.a+Outer2.this.b);  //30
                }
            }
    }

public class case3_variablesHavingSameNames {

    public static void main(String[] args) {
             new Outer2().new inner2().m2(1000, 2000);
    }

}
