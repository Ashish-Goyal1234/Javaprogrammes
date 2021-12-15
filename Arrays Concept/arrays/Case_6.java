package arrays;


public class Case_6 {

    int[] m1(){
        System.out.println("m1 method");
        int a[] = {10,20,30,40};
        return a;
    }
    
    void m2(Double d[]){
        System.out.println("m2 method");
        for(Double dd : d){
            System.out.println(dd);
        }
    }
    
    public static void main(String[] args) {
            Case_6 t = new Case_6();
            int x[] = t.m1();
            for(int xx : x){
                System.out.println(xx);
            }
            
            Double d[] = {20.5,30.5,40.5};
            t.m2(d);
    }

}
