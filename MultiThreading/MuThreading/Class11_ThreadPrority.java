/*
         Thread prioroity range = 1-10
         Default priority for main thread = 5
         1 is lowest priority and 10 is highest priority.
         Default priority of user-defined thread is also 5 as it is acquiring from main.
         
         To Represent Priority we have constants:
         MAX_PRIORITY = 10;
         MIN_PRIORITY = 1
         NORM_PRIORITY = 5
         
         If 3 threads having  priority = 5(Same Priority) then the thread execution is decided by "Thread Scheduler." 
         
*/


package MuThreading;

class MyThread6 extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
    }
}


public class Class11_ThreadPrority {

    public static void main(String[] args) {
        MyThread6 t1 = new MyThread6();
        //t1.setPriority(10);
        t1.setPriority(Thread.MAX_PRIORITY);
        
        MyThread6 t2 = new MyThread6();
        //t2.setPriority(10);
        t2.setPriority(Thread.MIN_PRIORITY);

      /*  MyThread6 t2 = new MyThread6();
        t2.setPriority(18)  // Exception occure "Illegal Argument Exception" (Priority range is from 1-10)
        
        If we are setting priority more than 10 we are getting exception "Illegal Argument Exception"
        
        ;*/
       
        
        t1.start();
        t2.start();
    }

}
//Note : Dont Expect exact output for(priority only) because we are using free licence of JDK but it runs fine in linux computers.