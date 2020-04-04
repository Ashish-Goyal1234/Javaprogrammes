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
         
      /*   Integer x3 =Integer.valueOf(null);
         System.out.println(x3);   //Number Format Exception
*/        
         // Integer x2 = Integer.valueOf("One");  // will get number format exception.
         
         Boolean b1 = new Boolean(true);   //true
         Boolean b2 = new Boolean("true"); //true
         Boolean b3 = new Boolean("True"); //true
         Boolean b4 = new Boolean("ratan");  //false
         Boolean b5 = new Boolean(null);  //false
         
         System.out.println(b1);
         System.out.println(b2);
         System.out.println(b3);
         System.out.println(b4);
         System.out.println(b5);
    }

}
