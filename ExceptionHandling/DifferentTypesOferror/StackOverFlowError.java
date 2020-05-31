package DifferentTypesOferror;

public class StackOverFlowError {

    void m1(){
        m2();
    }
    void m2(){
        m1();
    }
    public static void main(String[] args) {
    
            new StackOverFlowError().m1();
    }

}
