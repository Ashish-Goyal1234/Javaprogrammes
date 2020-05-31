package MuThreading;

class MyThread5 extends Thread{
    public void run(){
        
    }
}

public class Case10_MethodsInThread {

    public static void main(String[] args) {

        MyThread5 t1 = new MyThread5();
        t1.start();
        MyThread5 t2 = new MyThread5();
        t2.start();
        
        System.out.println("Get name of thread t1 : " + t1.getName());
        System.out.println("Get name of Thread t2 : " + t2.getName());
        
        t1.setName("Ashish_Thread1");
        t2.setName("Ashish_Thread2");
        
        System.out.println("Get name of thread t1 : " + t1.getName());
        System.out.println("Get name of Thread t2 : " + t2.getName());
        
        System.out.println("Current Name of Main Thread : " + Thread.currentThread().getName());  // To get Main thread name as reference varaiable not avaialable.
        Thread.currentThread().setName("Current_Main_Thread_Name");
        System.out.println("Current name of Main thread : " + Thread.currentThread().getName());  // To get Main thread name as reference varaiable not avaialable.

        System.out.println(t1.isAlive());  // to check whether thread is alive return boolean value.
        System.out.println(Thread.activeCount());  // return number of active thread count.
    }

}
