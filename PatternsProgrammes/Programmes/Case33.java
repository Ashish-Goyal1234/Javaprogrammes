/*
               A
              B B
             C C C
           D D D D
          E E E E E
         F F F F F F
 */

package Programmes;

public class Case33 {

    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            for (int j = 5 - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(" " + (char) (i + 65));
            }
            System.out.println();
        }
    }

}
