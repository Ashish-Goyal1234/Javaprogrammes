package arrays;


public class Case7_MultiDimensionalArray {

    public static void main(String[] args) {
                //index       0                1
           int [][] a = {{10,20,30}, {40,50,60}};
        //sub index     0  1    2      0    1   2
           
           System.out.println(a[1][2]);    //60 is printed.
           System.out.println(a[0][2]);   // 30 is printed
           System.out.println(a[1][1]);   // 50 is printed
           System.out.println(a[0][0]);  // 10 printed.
           
    
    }

}
