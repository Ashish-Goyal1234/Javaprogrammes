package NestedClasses;

public class Case6_MethodLocalinnerClass {

        void m1(){
          class inner5{
                void disp(){
                    System.out.println("Inner class method");
                }
            }
          
          class inner6 extends inner5{
              void disp2(){
                  System.out.println("Inner class method for displ2");
              }
          }
            new inner6().disp();
            new inner6().disp2();
        }
    public static void main(String[] args) {
        new Case6_MethodLocalinnerClass().m1();
    }
}
