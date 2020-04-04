package WrapperClasses;

/*warpper class             type of data we can pass

    Byte                            Byte, String
    Short                          Short, String
    Integer                        Int, String
    Long                             Long, String
    Float                            Float, double, String
    Double                          Double, string
    Character                      char
    Boolean                         Boolean, string
*/
public class P1_PrimitiveIntoIntegerObject {

    public static void main(String[] args) {
        //Converting Primitive or String into WrapperObject
        
     //   Integer i1 = new Integer(null);                //Number Format Exception.       
            Integer i2 = new Integer(10) ;               // 10
                    //    OR
     //    Integer i2 = Integer.valueOf(10);
            
            
            Integer i3 = new Integer("10");            //10
 //        Integer i4 = new Integer("Ashish");     // number format exception
//         Integer i5 = new Integer("10.5f");      // number format Exception.
//         Integer i6 = new Integer("10.5");       //number format exception
//         Integer i8 = new Integer("(int) 25.5"); //Number format Exception    
    
            
            Integer i7 = new Integer((int) 10.5f);  // 10
            
            Integer i9 = new Integer((int)25.5);
            
            Integer i10 = new Integer('a');   //Show hash code value 97
            
           // Integer i11 = new Integer("true");   //Number format exception
            
            
            // System.out.println(i1);
                System.out.println(i2);
                System.out.println(i3);
              //  System.out.println(i4);
              //  System.out.println(i5);
              //  System.out.println(i6);
                System.out.println(i7);
             //   System.out.println(i8);
                System.out.println(i9);
                System.out.println(i10);
             //   System.out.println(i11);
    }
 }
