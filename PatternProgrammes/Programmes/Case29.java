/*
               A
             BB
           CCC
         DDDD
 */

package Programmes;


public class Case29 {

    public static void main(String[] args) {
        for(int i=0;i<=3;i++){
            for(int j=3-1;j>=i;j--){
                System.out.print("  ");
            }
            for(int k=0;k<=i;k++){
                System.out.print((char)(i+65));
            }
           System.out.println();
        }
    }

}
