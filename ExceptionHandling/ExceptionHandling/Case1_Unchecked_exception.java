package ExceptionHandling;


public class Case1_Unchecked_exception {
        /*
         The Exceptions which are not checked by compile those are called unchecked Exception.
         JVM will give exception during runtime.
         */

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(10/0);  //Arithmatic exception.
        System.out.println("Hello World");
        
        int [] a = {10,20,30,40};
        System.out.println(a[6]);  // Array Index Out of Bound exception
        
        System.out.println("ratan".charAt(12)); // String index out of bound Exception
        
        Integer i = new Integer("ten"); //Number format Exception.
        System.out.println(i);
        System.out.println("Rest of application");
    }

    // In above Programmes, Code is compiled sucessfully but exception will get occured during runtime.
    // This type of Exception is called unchecked exception.
}
