package InstanceBlock;


public class Case4 {
    
    Case4(){
        this(10);
        System.out.println("0-args cons");
    }
    
    Case4(int a){
        System.out.println("1 args cons");
    }
    {
        System.out.println("Instance block");
    }
    public static void main(String[] args) {
        Case4 t = new Case4();
    }

}
