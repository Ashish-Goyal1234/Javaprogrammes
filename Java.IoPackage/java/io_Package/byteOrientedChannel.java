package java.io_Package;

import java.io.*;

public class byteOrientedChannel {

        
        public static void main(String[] args) throws IOException, FileNotFoundException {
            
            FileInputStream fis = new FileInputStream("abc.txt"); 
            FileOutputStream fos = new FileOutputStream("xyz.txt"); // used to writing the data.
            int c;            
        
             while((c = fis.read()) != -1) {
                 System.out.println((char)c);  
                 fos.write(c);
             }
                    fis.close();   
                     fos.close();  
             }
    }
