/*
       *****
         ****
           ***
             **
               *
 */

package Pattern_Programmes;

public class Case35 {

    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 5 - 1; j >= i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
