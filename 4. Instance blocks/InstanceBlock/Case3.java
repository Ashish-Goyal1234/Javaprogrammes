package InstanceBlock;


public class Case3 {
  
    Case3(){
        System.out.println("0-args cons");
    }
    Case3(int a){
        System.out.println("1-args cons");
    }
    Case3(int a, int b){
        System.out.println("2-args Cons");
    }
    {
        System.out.println("Static block 1");
    }
    {
        System.out.println("Static block 2");
    }
    public static void main(String[] args) {
        Case3 t = new Case3();
        
        Case3 t1 = new Case3(10);
        
        Case3 t2 = new Case3(10,20);
    }
}
