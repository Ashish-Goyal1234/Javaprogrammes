package StringManipulation;


public class Case2String_VS_StringBuffer {
    /*
    1. Two ways to create object in String 
       1. Without using new Keyword : which stores data in "String Constant Memory" and it always check before creating new object 
                                                       wheater already any object present having same value.
       2. With using new Keyword     : In entire Java new keyword creates a new Object, and object is created in Heap Memory.
       3. Only String class internally overrides ".equals" method and perform content comparison. StringBuffer does not override equals().
       4. As StringBuffer does not override equals() from object class, then it will perform object class ".equals()" means refernce comparison.
*/
    public static void main(String[] args) {
        String s1 = "ratan";
        String s2 = "anu";
        String s3 = "ratan";    
        System.out.println(s1==s2);     // false : because in "String constant memory" different obect is created.
        System.out.println(s1==s3);     // true  :  because in "String constant Memory" s1 and s3 both pointing to same object.
        
        String Str1 = new String("ratan");
        String Str2 = new String("anu");   
        String Str3 = new String("ratan"); 
        System.out.println(Str1==Str2);    //false : because "==" will check the refrence comparison and both references are pointing to different object.
        System.out.println(Str1==Str3);    // false : because "==" will check the refrence comparison and both references are pointing to different object.
        System.out.println(s1.equals(s2));   // false : because as String class overrides ".equals()" from object class but both values are different.
        System.out.println(s1.equals(s3));   // true  : because only String class internally overrides ".equals()" from object class and perform content comparison.
        
System.out.println("********************StringBuffer***********************");
// Default initial capacity of StringBuffer is "16".
//  New Capacity will be asses as new capacity = (Current capacity + 1)*2;
//                                                                        = (16+1)*2;
        StringBuffer sb1 = new StringBuffer("ratan");
        StringBuffer sb2 = new StringBuffer("anu");      
        StringBuffer sb3 = new StringBuffer("ratan");
        System.out.println(sb1==sb2);           // False : because "==" will check the refrence comparison and both references are pointing to different object.
        System.out.println(sb1==sb3);           // False : because "==" will check the refrence comparison and both references are pointing to different object.
        System.out.println(sb1.equals(sb2));  // False : stringBuffer never override ".equals()" from object class and also values are different in both object refernces.
        System.out.println(sb2.equals(sb3)); // False : StringBuffer never override ".equals()" from object class, only String class override ".equals()", so
                                                                         // both the refernce variable are pointing to differnt object and object class ".equals()" will execute means refernce comparison.
    }

}
