package CoreJavaAssignments;
/*
 * Class Demo{
 *       declare 2 instance varible
 * }
 * 
 * class Test{
 *      void m1(){
 *        print 2 variables
 *      }
 *      void m2(){
 *      print 2 variables
 *      }
 *      psvm(strong[] args){
 *             call m1();
 *             call m2()'
 *      }
 * }
 */

class Demo{
        int a =100;
        int b=200;
}
public class Assignment2 {
    Demo d = new Demo();
    void m1(){
        System.out.println(d.a);
        System.out.println(d.b);
    }
    
    void m2(){
        System.out.println(d.a);
        System.out.println(d.b);
    }
    public static void main(String[] args) {
        Assignment2 t = new Assignment2();
        t.m1();
        t.m2();
    }

}
