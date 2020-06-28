package Constructors;


public class Case1_DefaultCons {

    
     void m1(){
         System.out.println("M1 method");
     }
     /* default cons
     Case1_DefaultCons(){
          // Empty impementation
     }
     */
    public static void main(String[] args) {
        Case1_DefaultCons t = new Case1_DefaultCons();
        t.m1();
    }

}
