package FinallyBlock;


public class Case22_ExceptionNotMatchedFinallyExecuted {
// Programme will terminate abnormally as exception is not matched still finally block will executed.
    public static void main(String[] args) {
        try{
                System.out.println(10/0); // Airthmatic Exception
        }catch(NullPointerException e){
            System.out.println("Null Pointer Exception block");  //Abnormal termination as exception is not matched.
        }finally{
            System.out.println("Finally Block"); // Finally Block is executed then exception is displayed.
        }
    }

}
