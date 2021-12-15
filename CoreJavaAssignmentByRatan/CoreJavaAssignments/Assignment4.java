package CoreJavaAssignments;
        
       /* class Test{
            2-instance variable
            static void m1(){
                print 2 variables
            }
            
            static void m2(){
                print 2 variables
            }
            public static void main(String[] args) {
                call m1 and m2()
            }
        }*/

public class Assignment4 {
    
    int a =10;
    int b=20;
    

    static void m1(){
        Assignment4 t =new Assignment4();
        System.out.println(t.a);
        System.out.println(t.b);
    }
    
    static void m2(){
        Assignment4 t =new Assignment4();
        System.out.println(t.a);
        System.out.println(t.b);
    }
    public static void main(String[] args) {
        Assignment4.m1();
        Assignment4.m2();
        
    }

}
