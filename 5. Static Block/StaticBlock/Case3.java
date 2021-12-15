package StaticBlock;


public class Case3 {
    
    static int a;
    static {
        a=111;
    }
    
    static void disp(){
        System.out.println(Case3.a);
    }

    public static void main(String[] args) {
            Case3.disp();
    }

}
