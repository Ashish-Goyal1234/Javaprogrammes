/*
     ABCD
    ABCD
    ABCD
    ABCD
 */

package Pattern_Programmes;

public class Case10 {

    public static void main(String[] args) {
        // Without Using ASCII Values
        for (char i = 'A'; i <= 'D'; i++) {
            for (char j = 'A'; j <= 'D'; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        // By Using ASCII values

        for (int i = 65; i <= 68; i++) { // ASCII value of 'A' is 65 and 'D' is
                                         // 68
            for (int j = 65; j <= 68; j++) {
                System.out.print((char) j); // Typecasted to print the
                                            // characters from 65 to 68
            }
            System.out.println();
        }

    }
}
