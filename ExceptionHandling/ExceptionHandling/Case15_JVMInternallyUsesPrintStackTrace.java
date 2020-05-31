package ExceptionHandling;

public class Case15_JVMInternallyUsesPrintStackTrace {

    // JVM internall uses printStackTrace() if user dont assign any exception handler.
    void m3(){
    System.out.println(10/0);
}
    void m2(){
        m3();
    }
    void m1(){
    m2();    
    }
    public static void main(String[] args) {
        Case15_JVMInternallyUsesPrintStackTrace t = new Case15_JVMInternallyUsesPrintStackTrace();
        t.m1();
    }

}
