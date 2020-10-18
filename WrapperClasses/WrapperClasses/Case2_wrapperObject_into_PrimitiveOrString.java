package WrapperClasses;


public class Case2_wrapperObject_into_PrimitiveOrString {

    public static void main(String[] args) {
  
        
            Integer i1 = Integer.valueOf(100);
            Integer i2 = Integer.valueOf(100);
  // Converting wrapper object to primitive data type. xxxvalue()

              int x = i1.intValue();        // if I want int value
              double d = i1.doubleValue();   // if I want value in double format.
              
              System.out.println("Converted value in integer format : " + x);
              System.out.println("Converted value in double format : " + d);
              
              System.out.println(x+d);
              
      // converting Wrapper object to String:   toString()
              
              String s1 = i1.toString();
              String s2 = i2.toString();
              System.out.println("Converted value in String format :" + s1);
              
              System.out.println("Concatenating 2 string value : " + s1+s2);
              
    }

}
