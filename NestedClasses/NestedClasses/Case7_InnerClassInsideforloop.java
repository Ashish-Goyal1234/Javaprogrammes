package NestedClasses;

class outer6{
    void m1(){
        for(int i=1;i<5;i++){
            class inner6{
                void displ(){
                    System.out.println("Hello worls...!");
                }
            }
            new inner6().displ();
        }
    }
}

public class Case7_InnerClassInsideforloop {

    public static void main(String[] args) {
outer6 o = new outer6();
o.m1();
    }

}
