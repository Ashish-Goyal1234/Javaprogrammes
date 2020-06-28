package Variables;


public class Case8_StaticvsInstanceVariable {

    int a = 10;
    static int b=20;
    public static void main(String[] args) {
        Case8_StaticvsInstanceVariable t = new Case8_StaticvsInstanceVariable();
            System.out.println(t.a);   // 10
            System.out.println(t.b);  //20
            t.a=100;
            t.b=200;
            
            System.out.println(t.a);   // 100
            System.out.println(t.b);  //200
            
            Case8_StaticvsInstanceVariable t2 = new Case8_StaticvsInstanceVariable();
            System.out.println(t2.a);  //10
            System.out.println(t2.b);  //200
    }

}
