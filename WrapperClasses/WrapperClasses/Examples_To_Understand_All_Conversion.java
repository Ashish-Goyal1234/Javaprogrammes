package WrapperClasses;

// We require conversion because Java is object oriented langaueg and for converting our primitive to object we use wrapper class concept.
public class Examples_To_Understand_All_Conversion {
    /*
         Wrapper Class
         Byte                           : -128 to 127
         Short                         : -128 to 127
         Integer                      : -128 to 127
         Long                           : -128 to 127
         Character                   : 0 to 127
         Boolean                      : Always
         Float                           : NA (Consider only range we can provide wrapper class.)
         Double                        : NA (Consider only range we can provide wrapper class.)
     */
    public static void main(String[] args) {
        
        Integer a = 127;    // Autoboxing concept.
        Integer b = 127;  // Autoboxing concept.
        System.out.println(a==b);  // true : As values are within range, so it going to reuse exiting object only.
            
        // Above Autoboxing concept internally works same as
        Integer a1 = Integer.valueOf(127);
        Integer b1 = Integer.valueOf(127);
        System.out.println(a1==b1);  // true : As values are within range, so it going to reuse exiting object only.
        
        Integer a2  = 128;
        Integer b2 = 128;
        System.out.println(a2==b2);  // False : As values are out of range, so 2 different object going to create.
        
        // Some more comparisons :
        Integer x = new Integer(10);
        Integer y = new Integer(10);
        System.out.println(x==y);  // False : Because both are pointing to different objects.
        
        Integer x1 = new Integer(10);
        Integer y1 = 10;
        System.out.println(x1==y1);  // False : x1 create in new object and y1 is done by autoboxing
    }

}
