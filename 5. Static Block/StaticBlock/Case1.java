package StaticBlock;


public class Case1 {
    {
        System.out.println("Instance block-1");
    }
    {
        System.out.println("Instance Block-2");
    }
   static {
        System.out.println("Static Block-1");
    }
   static{
       System.out.println("Static block 2");
   }
   Case1(){
       System.out.println("0-args Cons");
   }
   Case1(int a){
       System.out.println("1-args Cons");
   }

    public static void main(String[] args) {
        new Case1();
        new Case1(10);
    }
}
