package ExceptionHandling;


public class Case5_ApplicationWithTryCatch {

    public static void main(String[] args) {
        System.out.println("Hello world..!");
        try{
            System.out.println(10/0);
        }catch(ArithmeticException ae){
            System.out.println(10/2);
        }
        System.out.println("Rest of the application");
    }

}
/*
 * O/P:
        Hello world..!
        5
        Rest of the application
    a.  Normal Termination
    b. Rest of the application is printed.
 */
