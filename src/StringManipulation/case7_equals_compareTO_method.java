package StringManipulation;


public class case7_equals_compareTO_method {

    public static void main(String[] args) {
        
        //equals() : return type is boolean.
        String s1 = "durga";
        String s2 = "anu";
        String s3 = "durga";
        System.out.println(s1.equals(s2));  // false
        System.out.println(s1.equals(s3)); // true
        System.out.println(s2.equals(s3)); //false
        System.out.println("ratan".equals("RATAN")); //false
        System.out.println("ratan".equalsIgnoreCase("RATAN"));  // true becuase we have used equalsIgnoreCase()
    
    // compareTo() : return type is int always compare unicode values of charcter.
    String str1 ="durga";
    String str2 = "anu";
    String str3 = "durga";
    System.out.println(str1.compareTo(str2)); // +3 unicode value of d = 100 and a = 97
    System.out.println(str1.compareTo(str3)); // 0 according to unicode values.
    System.out.println(str2.compareTo(str3)); // -3 unicode value of d = 100 and a = 97
    System.out.println("ratan".compareTo("RATAN")); //32 according to unicode values.
    System.out.println("ratan".compareToIgnoreCase("RATAN")); // 0 because we have used comparesIgnoreCase()
    
    }

}
