package ExceptionHandling;


public class Case8_ExceptionRaisedOtherThanTry {

    public static void main(String[] args) {
try{
    System.out.println("Hello world");
    System.out.println(10/0);
}catch(ArithmeticException ae){
    System.out.println(10/0);    // Exception Raised in catch block so abnormal termination
}
    }

}
