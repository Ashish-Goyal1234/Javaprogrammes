package ExceptionHandling;


public class Case16_ExceptionIsPropogatedToCallerMethod {
        // This concept is called Exception propogation.
    // Exception which is occured in m3() is handled in main method.
    // If main method does not contain any exception hadler then jvm will call default handler which uses printStacktrace().
    
    void m3(){
        System.out.println(10/0);    // Exception Raised in m3() so sending to m2() as m2() calling m3();
    }
    void m2(){
            m3();      // Exception is send to m1() as m1() is calling m2();
}
    void m1(){
        m2();       // Exception is send to main method as main method is calling m1();
    }
    
    
    public static void main(String[] args) {
        try{
            Case16_ExceptionIsPropogatedToCallerMethod t = new Case16_ExceptionIsPropogatedToCallerMethod();
            t.m1();
        }catch(ArithmeticException ae){
            System.out.println(10/2);
            System.out.println("Exception is handled in main method which is occured in m3()");
        }
    }

}
