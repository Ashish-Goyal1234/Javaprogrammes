/*
   1. Multiple threads are performing single task.
   2. Each a Every thread stack memory is created. whenever thread is destryed stack is destroyed.
 */

package Multithreading;

    class Thread6 extends Thread{
        public void run(){
            System.out.println("Thread Method");
        }
    }

public class Case8_MultipleThreadPerformingSingleTask {

    public static void main(String[] args) {
        Thread6 t1 = new Thread6();
        t1.start();
        Thread6 t2 = new Thread6();
        t2.start();
        Thread6 t3 = new Thread6();
        t3.start();
    }

}
