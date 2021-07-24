/*
     AAAA
     BBB
     CC
     D
 */

package Programmes;

public class Case21 {

    public static void main(String[] args) {
        // Directly printing characters
        for (char i = 'A'; i <= 'D'; i++) {
            for (char j = 'D'; j >= i; j--) {
                System.out.print(i);
            }
            System.out.println();
        }

        // Another way by using ascii values
        for (int i = 0; i <= 3; i++) {
            for (int j = 3; j >= i; j--) {
                System.out.print((char) (i + 65));
            }
            System.out.println();
        }

    }

}
