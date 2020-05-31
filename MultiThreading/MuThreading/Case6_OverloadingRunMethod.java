/*
   1. It is possible to overload Run method, but JVM always calls o-args run method.
 */

package MuThreading;

class MyThread4 extends Thread{
        public void run(){
            for(int i=0;i<=10;i++){
            System.out.println("0-args run method");
            run(10);   // if we need to call 1-args run() need to call that method in 0-args run method.
            }           
        }
        public void run(int a){
            for(int i=0;i<=10;i++){
                System.out.println("1-args run method");
                }
            }
 }
public class Case6_OverloadingRunMethod {
    public static void main(String[] args) {
        MyThread4 t = new MyThread4();
        t.start();
        for(int i=0;i<=10;i++){
            System.out.println("Main Thread");
        }
    }
}
