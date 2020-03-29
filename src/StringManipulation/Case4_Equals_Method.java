package StringManipulation;


public class Case4_Equals_Method {
    
    Case4_Equals_Method(String str) {
        
    }
    public static void main(String[] args) {
        //object  : equals() : performs Refrence comparision
        Case4_Equals_Method t1 = new Case4_Equals_Method("Ashish");
        Case4_Equals_Method t2 = new Case4_Equals_Method("Ashish");
        System.out.println(t1.equals(t2)); //o/p is false as it compares the refrences.
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
