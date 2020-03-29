package StringManipulation;


public class Case2String_VS_StringBuffer {

    public static void main(String[] args) {
        //Object without using new Keyword
        //Uses SCP memory and check for previous refrence created or not
        String s1 = "Ashish";
        String s2 = "PQR";
        String s3 = "Ashish";
        System.out.println(s1==s2); // == operator is always ment for refrence comparison.
        System.out.println(s1==s3); // O/p will be true as it checks for previous refrences.
        System.out.println(s3==s2);
        
        //By using new Keyword
        //Uses Heap memory and never check for previous refrence is created or not.
        String Str1 = new String("Ashish");
        String Str2 = new String("PQR");
        String Str3 = new String("Ashish");
        System.out.println(Str1==Str2);  // o/p is always false as new obj is created always
        System.out.println(Str1==Str3);  // o/p is always false as new obj is created always
        System.out.println(Str3==Str2); // o/p is always false as new obj is created always

        //StringBuffer always go to heap memory so never check for previous refrences
        StringBuffer sb1 = new StringBuffer("Ashish");
        StringBuffer sb2 = new StringBuffer("PQR");      
        StringBuffer sb3 = new StringBuffer("Ashish");
        System.out.println(sb1==sb2);  // o/p is always false as new obj is created always
        System.out.println(sb1==sb3);  // o/p is always false as new obj is created always
        System.out.println(sb3==sb2);  // o/p is always false as new obj is created always

        
    }

}
