package java.io_Package;

import java.io.*;

public class BufferedInputAndOutputStream {
    public static void main(String[] args) throws IOException, InterruptedException{
        BufferedInputStream br = new BufferedInputStream(new FileInputStream("abc.txt"));
        BufferedOutputStream bw = new BufferedOutputStream(new FileOutputStream("BuffWriterFile.txt"));
        
        int Line;
        
        while ((Line = br.read()) != -1) {  // It will read character by character not line by line
                System.out.println(Line);
                bw.write(Line);
        }
                br.close();
                bw.close();
        }          
}
