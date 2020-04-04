package ExceptionHandling;


public class case9_ExceptionRaisedInTryRestofTryBlockNotexecuted {

    // If exception raised in try blocked rest of the lines of try block are not executed 
    public static void main(String[] args) {
try{
        System.out.println(10/0);
        System.out.println("Code line 1");
        System.out.println("Code line 2");
}catch(ArithmeticException ae){
    System.out.println(10/2);
}

System.out.println("Rest of the application");
    }
/*
 *     O/p:
 *      5
        Rest of the application
 */
}
