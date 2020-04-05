package StringManipulation;


public class Case6_Coversion {

    public static void main(String[] args) {
        // Conversion of String to StringBuffer
        String s = "Ashish";
        StringBuffer sb = new StringBuffer(s);
        System.out.println(sb);
        System.out.println(sb.reverse()); //reverse() is not present in String class but present in StringBuffer.
        
        //Conversion of StringBuffer to String.
        StringBuffer sb1 = new StringBuffer("Ashish");
        String snew = sb1.toString();
        System.out.println(snew);
    }

}
