package java.io_Package;

import java.io.*;

public class bufferedReaderAndWriter  {
    public static void main(String[] args) throws IOException, InterruptedException{
    BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
    BufferedWriter bw = new BufferedWriter(new FileWriter("BuffWriterFile.txt"));
    
    String Line;
    
    while ((Line = br.readLine()) != null) {
            System.out.println(Line);
            bw.write(Line);
            bw.newLine();
    }
            br.close();
            bw.close();
    }          
}