package java.io_Package;

import java.io.*;
 
public class Seriazlization {

    public static void main(String[] args) throws IOException {

        Emp e = new Emp(111,"Ashish");
        FileOutputStream fos = new FileOutputStream("abc.txt"); // It wll write the data in some special symbols which is correct as we saved in object format.
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(e);
        System.out.println("Serialization process completed");
        oos.close();
        fos.close();
    }
 
}
