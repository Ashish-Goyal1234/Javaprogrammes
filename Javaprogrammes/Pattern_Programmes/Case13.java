/*
         1
         22
         333
         4444
 */

package Pattern_Programmes;

public class Case13 {

    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

}
