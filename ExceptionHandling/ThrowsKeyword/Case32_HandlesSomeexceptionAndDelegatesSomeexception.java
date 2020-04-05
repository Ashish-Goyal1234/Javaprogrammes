package ThrowsKeyword;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Case32_HandlesSomeexceptionAndDelegatesSomeexception {
   
        void m2() throws InterruptedException, FileNotFoundException{
            Thread.sleep(1000);
            FileInputStream  fis = new FileInputStream("abc.txt");    }
        void m1() throws FileNotFoundException{
            try{
            m2();
            }catch(InterruptedException e){
                e.printStackTrace();
                System.out.println("Exception is handled for Interrupt and throws for fileNotFound");
            }
        }
        
        public static void main(String[] args) {
            Case32_HandlesSomeexceptionAndDelegatesSomeexception t =new Case32_HandlesSomeexceptionAndDelegatesSomeexception();
           try{
            t.m1();
           }catch(FileNotFoundException ae){
               ae.printStackTrace();
               System.out.println("Exception is handled for FileNotFoundException");
           }
        }
}     