package WrapperClasses;


public class Case1_PrimitiveOrString_into_WrapperObject {

    public static void main(String[] args) {
        // Approach 1 by using constructor approach:
        Integer i1 = new Integer(10);           //primitive constructor
        Integer i2 = new Integer("10");     // String constructor.
        System.out.println(i1+i2);
        
        // Integer i2 = new Integer("ten");   // Will give Number Fomat Exception
        
        //Approac 2 by using valueOf() Method:
         Integer x1 = Integer.valueOf(100);
         Integer x2 = Integer.valueOf("100");
         System.out.println(x1+x2);
        
         // Integer x2 = Integer.valueOf("One");  // will get number format exception.
         
    }

}
