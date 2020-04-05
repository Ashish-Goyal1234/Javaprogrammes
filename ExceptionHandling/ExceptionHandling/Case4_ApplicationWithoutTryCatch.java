package ExceptionHandling;


public class Case4_ApplicationWithoutTryCatch {

    public static void main(String[] args) {
        System.out.println("hello World");
        System.out.println(10/0);   //Artithmatic Exception occured
        System.out.println("Rest of the code");
    }

    /*
     * Two problems faced:
     *a.  Abnormal termination
     *b.  Rest of the code is nnot execcuted.
     */
}
