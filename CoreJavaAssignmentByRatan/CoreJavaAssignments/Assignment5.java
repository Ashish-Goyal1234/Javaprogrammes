package CoreJavaAssignments;
/* class Test{
     2 static variables
     void m1(){
         print 2 variables
     }
     
     void m2(){
         print 2 variables
     }
     
     public static void main(String[] args) {
        call m1();
        call m2();
    }
 }*/

public class Assignment5 {
    
    static int a =100;
    static int b=200;
    
    void m1(){
        System.out.println(Assignment5.a);
        System.out.println(Assignment5.b);
    }
    
    void m2(){
        System.out.println(Assignment5.a);
        System.out.println(Assignment5.b);
    }
    public static void main(String[] args) {
        Assignment5 t = new Assignment5();
        t.m1();
        t.m2();
    }

}
