package java.io_Package;

import java.io.*;
public class Deserialization {

    public static void main(String[] args) throws Exception {
        
                FileInputStream fis = new FileInputStream("abc.txt");
                ObjectInputStream ois = new ObjectInputStream(fis);
                Emp e = (Emp) ois.readObject();
                System.out.println(e.eid+"----"+e.ename);
                fis.close();
                ois.close();
        }   
}
