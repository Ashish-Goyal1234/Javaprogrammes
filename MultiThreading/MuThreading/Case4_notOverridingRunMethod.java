package MuThreading;

class MyThread2 extends Thread{
      // Not Recommended as we are not overriding run().
      // Programme is executed but it is not useful to create thread as we are not overriding run method.
      // As we are not overriding run method, Thread class method run() is called which is having empth implementation.
    }


public class Case4_notOverridingRunMethod {

    public static void main(String[] args) {
        MyThread2 t = new MyThread2();
        t.start();
        for(int i =0;i<=10;i++){
            System.out.println("Main Thread");
        }
    }

}
