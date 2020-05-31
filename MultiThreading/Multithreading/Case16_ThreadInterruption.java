/*
     Whenever Thread Enteres into a sleeping mode then only we are able to interrupt thread. If we write Interrupt method
     without thread sleeping then Interrupt method is of no use, so to interupt thead, thread must be in sleeping mode.
  
 */

package Multithreading;

    class MyThread11 extends Thread{
        public void run(){
            try{
            for(int i=0;i<=5;i++){
                System.out.println(Thread.currentThread().getName() + " : " + i);   
                Thread.sleep(1000);   // if we remove this thread.interupt() is of no use.
            }
        }catch(Exception e){
            System.out.println("Thread is Interrupted.");
        }
    }
}
public class Case16_ThreadInterruption {

    public static void main(String[] args) {
        MyThread11 t = new MyThread11();
        t.start();
        t.interrupt();
    }
}
