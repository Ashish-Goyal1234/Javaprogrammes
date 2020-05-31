package MuThreading;

class Thread1 extends Thread{
       public void run(){
           System.out.println("Task 1");
       }
    }
    
    class Thread2 extends Thread{
        public void run(){
            System.out.println("Task 2");
        }
    }

    class Thread3 extends Thread{
        public void run(){
            System.out.println("Task 3");
        }
    }
    
public class Case9_DifferentThreadPerformingDifferentTask {

    public static void main(String[] args) {
       /* Thread1 t1 = new Thread1();
        t1.start();
        Thread2 t2 = new Thread2();
        t2.start();
        Thread3 t3 = new Thread3();
        t3.start();*/
        
                    new   Thread1().start();
                    new   Thread2().start();
                    new   Thread3().start();
    }
}