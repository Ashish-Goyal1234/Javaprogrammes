package ThrowsKeyword;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Case31_MethodcanThrowsMultipleException {

    void m2() throws InterruptedException, FileNotFoundException{
        Thread.sleep(1000);
        FileInputStream  fis = new FileInputStream("abc.txt");    }
    void m1(){
        try{
        m2();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        Case31_MethodcanThrowsMultipleException t =new Case31_MethodcanThrowsMultipleException();
        t.m1();
    }

}
