/*
               A
             A B
            A B C
           A B C D
          A B C D E
         A B C D E F
 */

package Programmes;

public class Case34 {

    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            for (int j = 5 - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(" " + (char) (k + 65));
            }
            System.out.println();
        }
    }

}
