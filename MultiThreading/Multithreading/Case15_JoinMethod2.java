/*
     E.G:
             Thread1(){
             
                 Thread2.join(2000);
                 
             }
             
    In the above example Thread1 will wait to completed its execution of Thread2 for 2 seconds, if Thread2 is 
    able to complete its execution within 2 seconds its ok otherwise aftre 2 seconds Thread1 again starts its execution
    and again  we are getting parallel output.
 
 */

package Multithreading;

        class MyThread10 extends Thread{
            public void run(){
                try{
                    for(int i=0;i<5;i++){
                    System.out.println(Thread.currentThread().getName()+" :"+ i);
                    Thread.sleep(1000);
                    }
                }catch(InterruptedException ie){
                    
                }
            }
        }

public class Case15_JoinMethod2 {

    public static void main(String[] args) throws InterruptedException {
        MyThread10 t1 = new MyThread10();
        MyThread10 t2 = new MyThread10();
        
        t1.start();     // Main Thread is calling t1 thread.
        
        t1.join(2000);  // Here 2 seconds waiting time added, It means Main Thread will wait only for 2 seconds 
                              // to complete the execution of t1, after 2 seconds main thread will also start its execution simulteniously. 
    
        t2.start();
        
        for(int i=0;i<=5;i++){
                System.out.println("Main Thread" + i);
                Thread.sleep(1000);
        }
    }

}
