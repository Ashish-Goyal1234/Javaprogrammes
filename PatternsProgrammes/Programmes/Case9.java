/*
            AAAA
            BBBB
            CCCC
            DDDD
*/

package Programmes;

public class Case9 {

    public static void main(String[] args) {

        // Directly taking character
        for (char i = 'A'; i <= 'D'; i++) {
            for (char j = 'A'; j <= 'D'; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        // By using Acsii Values

        for (int i = 65; i <= 68; i++) { // ASCII value of A is 65 and D is 68
            for (int j = 65; j <= 68; j++) {
                System.out.print((char) i); // type casting into character
            }
            System.out.println();
        }

    }
}
