package java.io_Package;

import java.io.Serializable;

public class Emp implements Serializable{
     transient int eid;    // Decalred as Transient so "0" will get print after deserialization.
    transient String ename; // Declared as String so "null" wll get print after deserialization.
    
    Emp(int eid, String ename) {  // local variable
            // conversion of local to instance
            this.eid = eid;
            this.ename = ename;
    }
}
