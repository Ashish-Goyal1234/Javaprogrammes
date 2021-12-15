package MuThreading;

class MyRunnable implements Runnable{

        @Override
        public void run() {
            for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName() + " : "+i);
            }
        }
        
    }
public class Case17_creatingThreadClassByRunnableInterface {

    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.start();
        
        for(int i=0;i<5;i++){
            System.out.println("Main Class : " + i);
        }
    }

}
