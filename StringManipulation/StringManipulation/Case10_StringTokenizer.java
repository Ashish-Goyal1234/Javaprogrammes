package StringManipulation;

import java.util.StringTokenizer;

public class Case10_StringTokenizer {

    public static void main(String[] args) {
        // Default splitting character in StringTokenizer is space
        StringTokenizer st = new StringTokenizer("hi sir class completed");
        while(st.hasMoreElements()) {   //hasMoreElement() to chek if token are avaialble
            String s = (String) st.nextElement(); // to read the tokens
            System.out.println(s);
        }
        
        // If I dont want splitting character as space and another methods used
        StringTokenizer  st1 = new StringTokenizer("hi si.r how. are y.ou","."); //My splitting character is '.'
        while(st1.hasMoreTokens()) {   //hasMoreElement() to chek if token are avaialble
            String s1 = st1.nextToken(); // to read the tokens
            System.out.println(s1);
        }
    }

}
