package WrapperClasses;


public class Case4_toStringMethod {

    public static void main(String[] args) {
            // toString() :  object class : classname@hashcode.
        Case4_toStringMethod t = new Case4_toStringMethod();
        System.out.println(t);
        System.out.println(t.toString());  //toString() presnt in object class.
        
        //string: to string() : override() object class : return content of the object
        String s = "ratan";
        System.out.println(s);
        System.out.println(s.toString());
        
        //stringBuffer : to()String : overrides() object class : return content of the object
        StringBuffer sb = new StringBuffer("durga");
        System.out.println(sb);
        System.out.println(sb.toString());
        
        //Wrapper classes :  to String() overrinding() : return content of the object
        Integer i = new Integer(100);
        System.out.println(i);
        System.out.println(i.toString());
        
        
        // to string method will execute only reference type / object type not primitive type
        int a = 100;
        System.out.println(a);
        // System.out.println(a.toString());  // Not allowed shows error cannot invoke primitive type int.
        
    }
}
