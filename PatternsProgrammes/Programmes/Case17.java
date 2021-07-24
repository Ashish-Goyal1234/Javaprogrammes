/*
          1  1  1  1 
          2  2  2 
          3  3 
          4 

 */

package Programmes;

public class Case17 {

    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" " + i + " ");
            }
            System.out.println();
        }
    }

}
