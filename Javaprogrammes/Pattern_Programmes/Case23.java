/*
     DDDD
     CCC
     BB
     A
 */

package Pattern_Programmes;

public class Case23 {

    public static void main(String[] args) {

        // Directly by using characters
        for (char i = 'D'; i >= 'A'; i--) {
            for (char j = 'A'; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        // By using ASCII Values.

        for (int i = 0; i <= 3; i++) {
            for (int j = 3; j >= i; j--) {
                System.out.print((char) (68 - i));
            }
            System.out.println();
        }
    }

}
