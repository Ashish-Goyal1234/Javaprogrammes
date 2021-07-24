/*
             A
           AB
         ABC
       ABCD
     ABCDE
 */

package Programmes;

public class Case30 {

    public static void main(String[] args) {
        for (int i = 0; i <= 4; i++) {
            for (int j = 4 - 1; j >= i; j--) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print((char) (k + 65));
            }
            System.out.println();
        }
    }

}
