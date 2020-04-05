package ExceptionHandling.FinallyBlock;


public class Case20_FinallyBlock {

    public static void main(String[] args) {

        try{
            System.out.println("try block");
        }catch(Exception e) {
            System.out.println("Catch block");
        }finally{
            System.out.println("finally block");   // Always Executed irrespective of try-catch block
        }
    }

}
