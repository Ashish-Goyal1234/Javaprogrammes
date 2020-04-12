package DifferentTypesOfException;

class MyThread extends Thread{
    
}

public class IllegalThreadStateException {
    public static void main(String[] args) {
   MyThread t = new MyThread();
   t.start();
   t.start();
    }
}
