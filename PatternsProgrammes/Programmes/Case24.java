/*
    ABCD
    ABC
    AB
    A
 */

package Programmes;

public class Case24 {

    public static void main(String[] args) {

        // Directly Assiging character values

        for (char i = 'D'; i >= 'A'; i--) {
            for (char j = 'A'; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // By Using ASCII Values.

        for (int i = 3; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (j + 65));
            }
            System.out.println();
        }
    }

}
