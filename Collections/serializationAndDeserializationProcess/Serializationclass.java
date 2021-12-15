package serializationAndDeserializationProcess;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializationclass {
    
    void serializationDemo() throws IOException{
        
        Emp e = new Emp(111,"ratan","password");
        
        FileOutputStream fos = new FileOutputStream("abc.txt");   // File is created in Same project Scroll down prject.
        ObjectOutputStream oos  = new ObjectOutputStream(fos);
        oos.writeObject(e);
        
        oos.close();
        System.out.println("Serialization process Compleets...!");
    }
    
    
    public static void main(String[] args) throws IOException {
        Serializationclass s = new Serializationclass();
        s.serializationDemo();
    }

}
