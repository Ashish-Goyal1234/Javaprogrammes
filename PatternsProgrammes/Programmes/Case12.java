/*
         DCBA
         DCBA
         DCBA
         DCBA

 */
package Programmes;


public class Case12 {

    // Without Using ASCII values.
    public static void main(String[] args) {
        for(char i='D'; i>='A'; i--){
            for(char j='D'; j>='A'; j--){
                System.out.print(j);
            }
            System.out.println();
        }
        
        //Using ASCII Values
        for(int i=68; i>=65; i--){
            for(int j=68; j>=65; j--){
                System.out.print((char)j);
             }
            System.out.println();
        }
    }

}
