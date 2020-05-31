/*
         DDDD
         CCCC
         BBBB
         AAAA
 */
package Programmes;


public class Case11 {

    public static void main(String[] args) {
     // With Using ASCII values
        for(int i=68;i>=65;i--){
                for(int j=68;j>=65;j--){
                    System.out.print((char)i);
                }
                System.out.println();
            }
        
        // Without Using ASCII Values
        
        for(char i='D'; i>='A'; i--){
            for(char j='D'; j>='A'; j--){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
