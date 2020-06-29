package CoreJavaAssignments;
   /* class Test{
        2 inst variables
        2 static variables
        
        void m1(){
            print 4 variables
        }
        
        static void m2(){
            print 4 variables
        }
         public static void main(String[] args) {
            call m1();
            call m2();
        }
    }*/

public class Assignment6 {
    
        int a =10;
        int b=20;
     static   int c =100;
    static    int d =200;
        
        void m1(){
            System.out.println(a);
            System.out.println(b);
            System.out.println(Assignment6.c);
            System.out.println(Assignment6.d);
        }
        
        static void m2(){
            Assignment6 t = new Assignment6();
            System.out.println(t.a);
            System.out.println(t.b);
            System.out.println(Assignment6.c);
            System.out.println(Assignment6.d);
            
        }

    public static void main(String[] args) {
        
        Assignment6 t = new Assignment6();
        t.m1();
        Assignment6.m2();

    }

}
