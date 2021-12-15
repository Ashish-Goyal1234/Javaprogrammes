package InstanceBlock;


public class  CAse2 {

    CAse2(){
        System.out.println("0-args constructor");
    }
    
    CAse2(int a, int b){
        System.out.println("2- args COnstructor");
    }
    
    CAse2(int a, int b, int c){
        System.out.println("3 args constructor");
    }
    {
        System.out.println("Instance block");
    }
    public static void main(String[] args) {
        CAse2 t = new CAse2();   // Instance block, 0-args constructor
        CAse2 t1 = new CAse2(10,20); //Instance block, 2- args COnstructor
        CAse2 t2= new CAse2(10,20,30); // Instance block, 3 args constructor
    }

}
