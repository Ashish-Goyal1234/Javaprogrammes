package InstanceBlock;


public class Case1 {
    
    
    Case1(){
        System.out.println("o-args cons");
    }
    {
        System.out.println("Instnce block");
    }
    public static void main(String[] args) {
        Case1 t = new Case1();
    }

}
