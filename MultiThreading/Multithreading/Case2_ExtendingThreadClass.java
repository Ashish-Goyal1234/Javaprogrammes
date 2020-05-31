/*
     1. Programmes starts from Main Method and t.start() is called.
     2. t.start() is present in Thread class (extended by MyThread class) 
                     and “MyThread” class is registered in “Thread scheduler” and then thread is created.
      3. After Registering "MyThread" class in 'Thread scheduler', start() automatically calls run().
      4. After Running the code output is not constatnt every time.
 
 */

package Multithreading;

 class MyThread extends Thread{   // Mythread is registered in "Thread Scheduler"
    public void run(){    // Overriden method from Thread class.
        for(int i=0;i<=10;i++){
            System.out.println("User Defined Thread");
        }
    }
}

public class Case2_ExtendingThreadClass {     // Main Thread
    public static void main(String[] args) {
        // User Thread Starting code
        MyThread t =new MyThread();
        // After Registering "My Thread" class in 'Thread scheduler', start() automatically calls run().
        t.start();     // This method is present in Thread class.
           // Main Thread execution
        for(int i=0;i<=10;i++){
            System.out.println("Main Thread");  
        }
    }

}
