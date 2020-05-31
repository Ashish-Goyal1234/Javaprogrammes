/*
     One thread has to wait Util completeion of another thread then we use Join Method.
     
     Understad with Example below:
     
     Thread1 is calling Threadt2.join() so Thread1 has to wait until thread2 is completed its Execution, no 
     parallel execution is going to happen.
      
     Thread1(){
     
         Thread2.join()
     }
     
 */
package MuThreading;

class MyThread9 extends Thread{
    public void run(){
        try {
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName() +" :"+  i );
                Thread.sleep(1000);
        }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
}

public class Case14_JoinMethod {
    public static void main(String[] args) throws InterruptedException {
        MyThread9 t1 = new MyThread9();
        MyThread9 t2 = new MyThread9();

        t1.start();
        t1.join();   // Main thread is Executing this line, So main thread has to wait until t1 completes its execution.
        t2.start();
        
        for(int i=0;i<5;i++){
            System.out.println("Main Thread :" + i);
            Thread.sleep(1000);
        }
        
    }
}
