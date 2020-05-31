package NestedClasses;

class outer7{
    static int a=10;
    static int b=20;
        static class inner7{
                void disp(){
                    System.out.println(a);
                    System.out.println(b);
                }
        }
}

public class Case8_Example {
    
    public static void main(String[] args) {
        new outer7.inner7().disp();
    }

}
