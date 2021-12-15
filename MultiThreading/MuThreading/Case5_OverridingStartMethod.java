package MuThreading;

class MyThread3 extends Thread{
        // It is never recommended to override the start method().
        // start() is overriden so thread will not get created.
        // to create a thread must execute start() from thread class and need to register "MyThread" class in 'Thread Scheduler'.
        public void start(){
            System.out.println("User defined Thread (Thread not created)");
        }
    }

public class Case5_OverridingStartMethod {

    public static void main(String[] args) {
        MyThread3 t =new MyThread3();
        // Thread is not created because it is executing MyThread class start method.
        // To create thread start method must be excuted from thread class, so do not override start method if you wanted to create thread.
        // Programme will execute but start mey=thod will work like normally.
        t.start();
        for(int i=0;i<=10;i++){
            System.out.println("Main Thread");
        }
    }

}
