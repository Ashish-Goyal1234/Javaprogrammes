package ExceptionHandling;

import java.io.FileInputStream;

public class Case2_CheckedException {

    public static void main(String[] args) {
            // The Exception which are checked by compiler are called as Checked Exception
        
        System.out.println("Hello world");
    //    Thread.sleep(1000);   // Interuppted Exception.
    //    FileInputStream fis = new FileInputStream("abc.txt");  //FileNotFOundException
        System.out.println("Rest of Application");
    }
// Above Example Exception is checked during compile time. 
}
