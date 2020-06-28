package Methods;


public class Case5_InsideStaticMethodThisKeywordNotAllowed {
    int a =100;
    int b=200;
    
   static  void m1(int a, int b){
        System.out.println(a+b);
        System.out.println(this.a+this.b);   // Exception this keyword is not allowed in Static method.
    }
    
    public static void main(String[] args) {
        Case5_InsideStaticMethodThisKeywordNotAllowed t = new Case5_InsideStaticMethodThisKeywordNotAllowed();
        t.m1(1000, 2000);
    }
}
