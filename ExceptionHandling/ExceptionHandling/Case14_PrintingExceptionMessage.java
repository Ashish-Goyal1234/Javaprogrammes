package ExceptionHandling;

public class Case14_PrintingExceptionMessage {

    void m3(){
        try{
            System.out.println(10/0);
        }catch(ArithmeticException ae){
            System.out.println(ae); //print exception and message
            System.out.println(ae.toString());    // this is same as ae. print exception and message
            System.out.println(ae.getMessage());  // only print message     / by zero
            ae.printStackTrace();  // shows complete stack tree (we use in our projects realtime)
        }
    }
    void m2() {
        m3();
    }
void m1 (){
    m2();
}
    public static void main(String[] args) {
        Case14_PrintingExceptionMessage t = new Case14_PrintingExceptionMessage();
        t.m1();
    }

}
