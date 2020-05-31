package WrapperClasses;

public class Case6_Equal_And_DoubleEqulaopera_Wrapperclasses {

    public static void main(String[] args) {
        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);
        System.out.println(i1==i2);     //false
        System.out.println(i1.equals(i2)); //true
        
        Integer x1 = new Integer(200);
        Integer x2 = new Integer(200);
        System.out.println(x1==x2);   //fals
        System.out.println(x1.equals(x2));  //true
    
    //In case of valueOf method will always cache value in the range -128 to 127
    
        Integer j1 = Integer.valueOf(10);
        Integer j2 = Integer.valueOf(10);
        System.out.println(j1==j2);                     //true
        System.out.println(j1.equals(j2));      //true
        
        Integer y1 = Integer.valueOf(200);
        Integer y2 = Integer.valueOf(200);
        System.out.println(y1==y2);                     //false
        System.out.println(y1.equals(y2));              //true
    
   /*     Note : equals ()  always checks data Comparison.class
        new operator : == creates different objects.
        
        valueOf() :  -128  to 127 : ref variable are pointing to same object.*/
    }

}
