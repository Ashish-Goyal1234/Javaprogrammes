package WrapperClasses;

public class Case6_Equal_And_DoubleEqulaopera_Wrapperclasses {

    public static void main(String[] args) {
        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);
        System.out.println("Refrence comparison by cons approach  : " + (i1==i2));                 //false
        System.out.println("Content comparison by cons approach    :" + i1.equals(i2));            //true
        
        Integer x1 = new Integer(200);
        Integer x2 = new Integer(200);
        System.out.println( "Refernce Comparision by cons approach    :" + (x1==x2));               //false
        System.out.println("Content Comparison by cons approach        :" + x1.equals(x2));       //true
     
        
        System.out.println("********************ValueOF()**********************");
   /* Note : In case of valueOf method will always cache value in the range -128 to 127( This concept is applied to == operator.)
                  equals ()  always checks data Comparison.class
                  new operator : == creates different objects.
                   valueOf() :  -128  to 127 : ref variable are pointing to same object.*/
        
        Integer j1 = Integer.valueOf(10);
        Integer j2 = Integer.valueOf(10);
        System.out.println("Refrence comparision by using valueOf()  :" + (j1==j2));           //true      within the range the values are pointing to same object.
        System.out.println("Content comparision by using valueOf()    :" + j1.equals(j2));    //true       
        
        Integer y1 = Integer.valueOf(200);
        Integer y2 = Integer.valueOf(200);
        System.out.println("Refernce comparison by using valueOf() :" + (y1==y2));                  //false as 200 occurs outside the range so it caches the value.
        System.out.println("Content Comparison by using valueOf()   :" + y1.equals(y2));          //true
    
   
        
        System.out.println("********************AutoBoxing which internally uses valueOf()**********************");
                                          // Internally uses valueOf(), so if value within the range then output is true, if value is outside the range then value is false.
        Integer a = 10;
        Integer b = 10;
        System.out.println("Reference comparison (Autoboxing which internally uses valueOf() concept) : " + (a==b));       // true
        System.out.println("Content comparision (Autoboxing which internally uses valueOf() concept)    :" + a.equals(b)); // true
        
        Integer c = 200;
        Integer d = 200;
        System.out.println("Reference comparison (Autoboxing which internally uses valueOf() concept) : " + (c==d));    // false
        System.out.println("Content comparision (Autoboxing which internally uses valueOf() concept)    :" + c.equals(d)); // true
       
    }
}
