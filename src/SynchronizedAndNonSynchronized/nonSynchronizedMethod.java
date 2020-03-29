package SynchronizedAndNonSynchronized;

class A{
    public static void status(String msg){
        for (int i = 0;i<=3;i++){
            System.out.println("hi = " + msg);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }
}

class Mythread1 extends Thread {
    public void run() {
        A.status("thread1 running");
    }
}

class Mythread2 extends Thread {
    public void run() {
        A.status("thread2 running");
    }
}

class Mythread3 extends Thread {
    public void run() {
        A.status("thread3 running");
    }
}
public class nonSynchronizedMethod {
            public static void main(String[] args) {
                
               // As non synchronized all the threads are getting exeuted.
                new Mythread1().start();
                new Mythread2().start();
                new Mythread3().start();
            }
}

      /*  Output:
            hi = thread2 running
            hi = thread1 running
            hi = thread3 running
            hi = thread2 running
            hi = thread3 running
            hi = thread1 running
            hi = thread1 running
            hi = thread3 running
            hi = thread2 running
            hi = thread3 running
            hi = thread2 running
            hi = thread1 running
*/