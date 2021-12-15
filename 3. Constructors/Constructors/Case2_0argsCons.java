package Constructors;


public class Case2_0argsCons {

    void m1(){
        System.out.println("M1 method");
    }
    Case2_0argsCons(){
        System.out.println("0-args constructor");
    }
    
    Case2_0argsCons(int a){
        System.out.println("1-args constructor");
    }
    public static void main(String[] args) {
        Case2_0argsCons t = new Case2_0argsCons();
        Case2_0argsCons t1 = new Case2_0argsCons(10);
        t.m1();
        t1.m1();
    }

}
