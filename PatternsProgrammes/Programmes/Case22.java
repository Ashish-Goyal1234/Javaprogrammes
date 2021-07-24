/*
      DCBA
      DCB
      DC
      D

 */

package Programmes;

public class Case22 {

    public static void main(String[] args) {

        // Directly printing characters

        for (char i = 'A'; i <= 'D'; i++) {
            for (char j = 'D'; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

        // Another way by using ascii values
        for (int i = 0; i <= 3; i++) {
            for (int j = 3; j >= i; j--) {
                System.out.print((char) (j + 65));
            }
            System.out.println();
        }

    }

}
