package serializationAndDeserializationProcess;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationClass {
    
    void DeserializationDemo() throws IOException, ClassNotFoundException {
        
        FileInputStream fis = new FileInputStream("abc.txt");  // Reading abc.txt file from same project scroll down project
        ObjectInputStream oos = new ObjectInputStream(fis);
        Emp e = (Emp) oos.readObject();
        System.out.println(e.eid +" "+e.name+" "+e.password);
        oos.close();
    }

    public static void main(String[] args) throws ClassNotFoundException, IOException {
        DeserializationClass d = new DeserializationClass();
        d.DeserializationDemo();
    }

}
