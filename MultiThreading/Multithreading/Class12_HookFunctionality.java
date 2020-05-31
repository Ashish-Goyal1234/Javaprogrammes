 /*
1. Hook Thread is normal thread, its special functionality is that it will be executed 
    when programme terminates normally or Abnormally.
2. E.g: while perfoming transactions we need to close the database wheater transction
    is worked normally or abnormally we need to close the database, then there hook functionality suits better.
 
 
 */
package Multithreading;

class MyThread7 extends Thread{
    public void run(){
        System.out.println("Hook Functionality");
    }
}

public class Class12_HookFunctionality {

    public static void main(String[] args) throws InterruptedException {
        MyThread7 t1 = new MyThread7();
        
        Runtime r = Runtime.getRuntime();
        r.addShutdownHook(t1);
        
        for(int i = 1;i<10;i++){
            System.out.println("Main Thread");
            Thread.sleep(1000);
            
/*            if(i==5){    Used to shutdown the execution after 5 time to check with abnormal termination.
                System.exit(0);   // JVM Will Shut down.  
            }*/
        }
    }

}
