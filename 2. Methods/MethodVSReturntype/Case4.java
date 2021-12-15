package MethodVSReturntype;


public class Case4 {
   
    int a =100;
    
    int m1(int a){
        System.out.println("Return local variable value");
        return a;    // local variable value is printed.
    }
    
    int m2(){
        System.out.println("Return instance variable value");
        return a;
    }
    
    int m3(int a){
        System.out.println("return instance variable value");
        return this.a;  // uses this keyword to call the instance variable.
    }

    public static void main(String[] args) {
        Case4 t = new Case4();
        int val1 = t.m1(1000);
        System.out.println(val1);
        
        int val2 = t.m2();
        System.out.println(val2);
        
        int val3 = t.m3(1000);
        System.out.println(val3);
    }

}
