/*
         A
         AB
         ABC
         ABCD
 */
package Programmes;


public class Case16 {

    public static void main(String[] args) {
        for(char i='A';i<='D';i++){
            for(char j='A'; j<=i; j++){
                System.out.print((char)j);
            }
            System.out.println();
        }
    }

}
