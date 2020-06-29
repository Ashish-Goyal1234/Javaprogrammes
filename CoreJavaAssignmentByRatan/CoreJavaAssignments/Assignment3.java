package CoreJavaAssignments;
/*
     class Test{
         2 static variables
         Static void m1(){
         print 2 variables
         }
         Static void m2(){
         print 2 variables
         }
         psvm(string[] args){
         call m1();
         call m2();
         }
     }
 */

public class Assignment3 {

    static int a=10;
    static int b=20;
    
    static void m1(){
        System.out.println(Assignment3.a);
        System.out.println(Assignment3.b);
    }
    
    static void m2(){
      System.out.println(Assignment3.a);
      System.out.println(Assignment3.b);
    }
    public static void main(String[] args) {
        Assignment3.m1();
        Assignment3.m2();
    }

}
