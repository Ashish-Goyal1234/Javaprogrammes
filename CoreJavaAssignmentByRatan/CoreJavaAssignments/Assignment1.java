package CoreJavaAssignments;

/*
         Class Test{
             declare 2 instance variable
             void m1(){
             prnt 2 variables
             }
             void m2(){
             print 2 variables
             }
             psvm(){
             call m1 and m2 method.
             }
         }
 */
public class Assignment1 {

    int a =10;
    float b=10.5f;
    
    void m1(){
        System.out.println(a);
        System.out.println(b);
    }
    
    void m2(){
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        Assignment1 t = new Assignment1();
        t.m1();
        t.m2();
    }

}
