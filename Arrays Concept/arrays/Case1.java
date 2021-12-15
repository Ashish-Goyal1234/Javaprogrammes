package arrays;

/*
 *    There are 3 approaches to print array data
 */
public class Case1 {

    public static void main(String[] args) {
        
            int a[] = {10,20,30,40};
            //1. By using index values
            System.out.println(a[0]);
            System.out.println(a[1]);
            System.out.println(a[2]);
            System.out.println(a[3]);
            
            // 2. By using for loop
            
            for(int i=0;i<a.length;i++){
                System.out.println(a[i]);
            }
            
            // 3. By using forEach loop
            for(int aa : a){
                System.out.println(aa);
            }
    }

}
