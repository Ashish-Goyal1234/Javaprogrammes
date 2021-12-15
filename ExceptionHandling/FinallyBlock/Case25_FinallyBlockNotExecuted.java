package FinallyBlock;


public class Case25_FinallyBlockNotExecuted {

    // Once the control enters in try block then only finally block is executed.
    public static void main(String[] args) {
        
        System.out.println(10/0);
        
        try{
            System.out.println("try block");
        }finally{
            System.out.println("Finally block");
        }
    }

}
