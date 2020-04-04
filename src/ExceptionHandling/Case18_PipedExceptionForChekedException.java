package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Case18_PipedExceptionForChekedException {
 
    // Piped Exception can be used in uncheck if exception is present in try block no issues.
    // Piped Exception used in checked exception must be present in try block otherwise error will occur (Refer Case18 example)
    
    public static void main(String[] args) {
    try{
        Thread.sleep(1000);
      //  FileInputStream fis = new FileInputStream("abc.txt");
    }
    
    /*        Below Pipe syntax will generate error maessage as we havent used any code which 
    will handle by FileNotFoundException*/
   
    catch(InterruptedException | FileNotFoundException a){
        System.out.println("Will generate error message as try does not contain any code which will handled by"
                + "fileNotFoundException" + a);
        }
    }
}
