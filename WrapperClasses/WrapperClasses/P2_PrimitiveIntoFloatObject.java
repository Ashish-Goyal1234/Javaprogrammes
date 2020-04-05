package WrapperClasses;


public class P2_PrimitiveIntoFloatObject {

    public static void main(String[] args) {

            Float f1 = new Float(10);                              //10.0
            Float f2 = new Float((int) 10);                     //10.0
            
            Float f3 = new Float("10");                         //10.0
           // Float f4 = new Float("Ashish");                   // number format exception
            
            System.out.println(f1);
            System.out.println(f2);
            //System.out.println(f3);
            //System.out.println(f4);
    }

}
