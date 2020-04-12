package ThrowKeyword_UserDefinedException;

/*
     1.Two ways ro create UserDefined checked Exception:
     1. O-args constructor.
     2. Params const approach.
 */

public class InvalidAgeException  extends Exception{
        // Default constructor Approch for creating userdefine checked constructor.
    InvalidAgeException(){  // only Exception is printed.
        
    }
    
    InvalidAgeException(String str){   // Exception with message is printed.
        super(str);  // calling super class cons (Exception class) by passing our info
    }
}
