package FinallyBlock;

public class Case28_tryCatchFinallyReturnStatement {
    int m1(){
        try{
                return 10;
        }catch(Exception e){
                return 20;
        }finally{
                return 30;    // 30 is printed as finally block is most recent return..
        }
    }
    public static void main(String[] args) {
        Case28_tryCatchFinallyReturnStatement t = new Case28_tryCatchFinallyReturnStatement();
       System.out.println( t.m1());
    }

}
