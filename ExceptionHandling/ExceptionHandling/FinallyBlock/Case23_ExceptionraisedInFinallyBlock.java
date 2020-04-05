package ExceptionHandling.FinallyBlock;


public class Case23_ExceptionraisedInFinallyBlock {

    public static void main(String[] args) {
try{
    System.out.println("try block");
}catch(Exception e){
    System.out.println("catch block");
}finally{
    System.out.println(10/0); // Abnormal Termination exception raised in finally block.
}
    }

}
