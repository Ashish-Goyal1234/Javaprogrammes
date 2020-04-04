package ExceptionHandling;


public class Case6_catchDeclareMandatory {
    
                // Only try blocks are not allowed.
    
    public static void main(String[] args) {
        try{
            System.out.println("Hello world");
        }
        System.out.println("rest of the application");
    }
/* o/p:
 * Error : try without 'finally' , 'catch' resource declaration
 */
}
