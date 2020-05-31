package FinallyBlock;


public class Case27_JVMWillDisplayRecentException {

    /* finally Exception(Array Index out of bound exception) occurs during runtime as it is most recent exception.
     
      
     */
    public static void main(String[] args) {
        
        try{
            System.out.println(10/0);  // Arithmetic Exception
        }catch(ArithmeticException ae){
            System.out.println("Ashish".charAt(12));   //StringIndexOutOfBoundException
        }finally{
            char [] a ={10,20,30};
            System.out.println(a[7]);  // Array Index Out of bound Exception
        }
    }

}
