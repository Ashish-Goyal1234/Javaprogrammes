package java.io_Package;

import java.io.*;

public class Case1_byteOrientedChannel {

        /*
         *  1. For Reading File File is Mandatory to Read File
         *  2. For writing file file is optional If file is not present create file and write the data.
         */
        public static void main(String[] args) throws IOException, FileNotFoundException {
            
            
            
            FileInputStream fis = new FileInputStream("abc.txt");    // File is present in Same Location so dirctly write "abc.txt".           
            FileOutputStream fos = new FileOutputStream("xyz.txt"); // used to writing the data.
            int c;            
        
             while((c = fis.read()) != -1) {     // fis.read()  return int value, unicode value for first character.
                 System.out.println((char)c);  
                 fos.write(c);                     // write unicode value.
             }
                    fis.close();   
                     fos.close();  
             }
    }
