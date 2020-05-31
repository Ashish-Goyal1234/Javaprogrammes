package Multithreading;

class Thread5 extends Thread{
   
    // No need to write all the logics inside run method, we can create our method and just call that method in run().
    public void run(){
        m1();
        m2();
        m3();
    }
    
    void m1(){System.out.println("Listening Music");}
    void m2(){System.out.println("Downloading movie");}
    void m3(){System.out.println("Running eclipse");}
}


public class Case7_MultipleThreads {

    public static void main(String[] args) {
        Thread5 t = new Thread5();
        t.start();
        for(int i=5;i<=10;i++){
            System.out.println("Main Thread");
        }
    }
}
