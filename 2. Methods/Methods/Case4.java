package Methods;


public class Case4 {

    int a =100;
    int b=200;
    
    void m1(int a, int b){
        System.out.println(a+b);
        System.out.println(this.a+this.b);
    }
    
    public static void main(String[] args) {
        Case4 t = new Case4();
        t.m1(1000, 2000);
    }

}
