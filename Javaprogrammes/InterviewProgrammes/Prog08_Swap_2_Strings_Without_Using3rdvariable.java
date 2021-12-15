package InterviewProgrammes;


public class Prog08_Swap_2_Strings_Without_Using3rdvariable {

    public static void main(String[] args) {
            String a = "Hello";
            String b = "World";
            System.out.println("Before Swapping : " + a + " " + b );

                // 1. Append a and b
            a = a+b;  // Helloworld
            
               // 2. Store initial String a in string b.
            b = a.substring(0, a.length() - b.length());
            
            // 3. Store initial String b in string a.
            
            a = a.substring(b.length());
            System.out.println("After Swapping : " + a + " " + b );

    }
}
