package StringManipulation;


public class case8_basicMethodsInString {

    public static void main(String[] args) {
        String s1 = "ratan";
        System.out.println(s1.charAt(2));  // t
        System.out.println(s1.indexOf('a')); // 1
        System.out.println(s1.lastIndexOf('a')); // 3
        System.out.println(s1.length());  //
        
        String s2 = "hi sir how r u";
        System.out.println(s2.startsWith("hi")); //true
        System.out.println(s2.startsWith("u")); // false
        System.out.println(s2.endsWith("u")); //true
        System.out.println(s2.contains("sir")); //true
        
        //Method chaining
        String s3 = "   ratan   ";
        System.out.println(s3.length()); // 11 first3 blank spaces 5 char name and after 3 blank spaces = 11
        System.out.println(s3.trim().length()); // 5 starting and ending spaces are removed
        System.out.println(s3.trim().substring(2).length()); //3 starting and ending spaces are removed and starts with 't' char.
        System.out.println(s3.trim().substring(1, 3).length()); //2 Starts with index 1 and ends with index 3
        
        //length variable vs length() method.
        
        int [] a = {10,20,30};
        System.out.println(a.length);
        String str = "ratan";
        System.out.println(str.length());
    
        //Split()
        String s4 = "hi sir how r u";
        String [] s = s4.split(" "); // need to give splitting character, I have given spaces.
        for(String ss : s) {
            System.out.println(ss);
        }
    }

}
