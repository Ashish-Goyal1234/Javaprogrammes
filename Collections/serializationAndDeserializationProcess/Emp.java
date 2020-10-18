package serializationAndDeserializationProcess;

import java.io.Serializable;

public class Emp implements Serializable{

    int eid;
    String name;
   transient String password;   // instead of original values default value is transferred. (preventing serialization)
        Emp(int eid, String name, String password){
            this.eid = eid;
            this.name = name;
            this.password = password;   
        }

}
