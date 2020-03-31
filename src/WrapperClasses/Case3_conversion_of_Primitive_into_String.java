package WrapperClasses;


public class Case3_conversion_of_Primitive_into_String {

    public static void main(String[] args) {
            //Converting primitive into string:     valueOf()
        
        int a =10 , b = 20;
       String s1  = String.valueOf(a);
       String s2 = String.valueOf(b);
       System.out.println(s1+s2);
    
       //Converting String into Primitive :   parsexxx()
       String str1 = "100";
       String str2 = "200";
       int a1 = Integer.parseInt(str1);
       float f = Float.parseFloat(str2);
       System.out.println(a1+f);
       
    }

}
