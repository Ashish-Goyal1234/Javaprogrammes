package FinallyBlock;


public class Case26_FinallyBlockNotExecutedJVMShutDown {

    public static void main(String[] args) {
try{
        System.out.println("try block");
        System.exit(0);   // JVM will get shut down.
    }finally{
        System.out.println("final block");  // Finally block is not executed in case of  JVM Shutdown.
    }
    }

}
