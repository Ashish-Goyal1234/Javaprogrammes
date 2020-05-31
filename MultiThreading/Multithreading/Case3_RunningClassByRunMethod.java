package Multithreading;

    class MyThread1 extends Thread{
        public void run(){
            for(int i=0;i<=10;i++){
            System.out.println("User defined Thread");
            }
        }
    }


public class Case3_RunningClassByRunMethod {
    public static void main(String[] args) {
        MyThread1 t = new MyThread1();
        t.run();    // Thread is not created as thread is not registered in "Thread Scheduler". works as normal method calling.
        // To register thread in "thread Scheduler" and to created thread we must use start().
        // for more clarification understand case1 example.
        
        for(int i=0;i<=10;i++){
            System.out.println("Main method thread");
        }
    }

}
