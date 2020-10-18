package StringManipulation;


public class Case9_StringBufferMethods {

    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("ratanit");
        System.out.println(sb1.delete(2, 4)); //ranit
        
        StringBuffer sb2 = new StringBuffer("Ashish");
        System.out.println(sb2.deleteCharAt(3)); //Ashsh
        
        StringBuffer sb3 = new StringBuffer("durgasoft");
        System.out.println(sb3.reverse());
        
        StringBuffer sb4 = new StringBuffer("ratan");
        System.out.println(sb4.append("soft"));

        StringBuffer sb5 = new StringBuffer("ratan");
        System.out.println(sb5.insert(0, "hi "));
    
        StringBuffer sb6 = new StringBuffer("hi durga soft");
        System.out.println(sb6.replace(3, 9, "ratan "));
        }

}
