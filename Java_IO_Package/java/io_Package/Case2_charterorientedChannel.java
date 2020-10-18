package java.io_Package;

import java.io.*;

public class Case2_charterorientedChannel {

    public static void main(String[] args) throws IOException, FileNotFoundException {
        FileReader fis = new FileReader("abc.txt"); 
        FileWriter fos = new FileWriter("Ashish.txt"); // used to writing the data.
        int c;            
    
         while((c = fis.read()) != -1) {
             System.out.println((char)c);  
             fos.write(c);
         }
                fis.close();   
                 fos.close();  
         }
}
