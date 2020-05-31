package StringManipulation;


public class Case4_Equals_Method {
    
    Case4_Equals_Method(String str) {
        // Case4_Equals_Method does not contain any equals method.
    }
    public static void main(String[] args) {
       /*
        1.  equals() : calls from object class and return type is boolean and object class equals perform refrence comparision..
        2.  General concept is, if 2 refrence variable pointing to same object it returns true
        3.  String class is child of object class, string overriding equals() and performe content comparision.
        4. StringBuffer not oveerinding equals(), parent of StrigBuffer is object class and uses object class equals().
        5. == operator is meant for always refrence comparision.
            equals() : object  : refrence comparison.
            String : overriding equal() : content comparison.
            StringBuffer : not  overriding equals() it uses parent class equals() : ref-comparision.
            == : refrence comparison.
        */
        
        Case4_Equals_Method t1 = new Case4_Equals_Method("Ashish");
        Case4_Equals_Method t2 = new Case4_Equals_Method("Ashish");
        System.out.println(t1.equals(t2)); //o/p is "false" because Case4_Equals_Method does not contain any equlas method ans so it will call parent class equals method which is refrence comaprion so o/p is false. 
        System.out.println(t1==t2); // false 
        
        //String : overriding eqquals() : perform content comparision.
        String s1 = "Ashish";
        String s2 = "Ashish";
        System.out.println(s1.equals(s2)); // o/p is true is string compares contents.
        System.out.println(s1==s2); //true
        
        String str1 = new String("Ashish");
        String str2 = new String("Ashish");
        System.out.println(str1.equals(str2)); // o/p is true is string compares contents.
        System.out.println(str1==str2); //false as == always ment for refrence comparison here two new objects are created so refrences are different.
     
        
        //StringBuffer : no class : it uses object class equals() : ref comparision.
        StringBuffer buffer1 = new StringBuffer("Ashish");
        StringBuffer buffer2 = new StringBuffer("Ashish");
        System.out.println(buffer1.equals(buffer2)); //o/p is false as it compares the refrences.
        System.out.println(buffer1==buffer2); // false
    }
}
