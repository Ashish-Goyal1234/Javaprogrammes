/*
     Demon Threads : The Threads which are executing at background are called as Demon Threads, but are giving support to foreground threads.
 E.g: In movie we are able to see Hero, heroin, the Director, technitians, coregrapers are called as Demon threads.

 */
package Multithreading;

class MyThread8 extends Thread{
    public void run(){
       try{
        for(int i = 1;i<10;i++){
        System.out.println("Damon Functionality");
            Thread.sleep(1000);
        }
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


public class Class13_DeamonThread {
    
    
    public static void main(String[] args) throws InterruptedException {
       // Whenever Main Thread Completes its functionality , Demon threads are automatically closed wheater
      //  it is completed or not completed/
        MyThread8 t = new MyThread8();
        t.setDaemon(true);
        t.start();
        
        for(int i = 0;i<=2;i++){
            System.out.println("Main Thread");
            Thread.sleep(1000);
        }
    }

}
