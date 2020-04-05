
package SynchronizedAndNonSynchronized;

class A1 {

    public static synchronized void status(String msg) {
        for (int i = 0; i <= 3; i++) {
            System.out.println("hi = " + msg);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }
}

class Mythread11 extends Thread {
    public void run() {
        A1.status("thread1 running");
    }
}

class Mythread22 extends Thread {
    public void run() {
        A1.status("thread2 running");
    }
}

class Mythread33 extends Thread {
    public void run() {
        A1.status("thread3 running");
    }
}

public class Synchronized {
    public static void main(String[] args) {

        /*
         * As synchronized it will execute 1st thread and then it will exeute
         * second thread and then it will execute the third thread.
         */
        new Mythread11().start();
        new Mythread22().start();
        new Mythread33().start();
    }
}

/*output:
    hi = thread1 running
    hi = thread1 running
    hi = thread1 running
    hi = thread1 running
    hi = thread3 running
    hi = thread3 running
    hi = thread3 running
    hi = thread3 running
    hi = thread2 running
    hi = thread2 running
    hi = thread2 running
    hi = thread2 running

*/