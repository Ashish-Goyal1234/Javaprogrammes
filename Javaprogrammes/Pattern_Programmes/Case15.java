/*
        A
        BB
        CCC
        DDDD
 */

package Pattern_Programmes;

public class Case15 {

    public static void main(String[] args) {
        for (char i = 'A'; i <= 'D'; i++) {
            for (char j = 'A'; j <= i; j++) {
                System.out.print((char) i);
            }
            System.out.println();
        }

    }

}
