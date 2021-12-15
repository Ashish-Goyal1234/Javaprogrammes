package StaticBlock;


public class Case4_FinalClassContains_All_Concept_Of_Class {
    int a =10; // instance variable
    static int b = 20; //static variable
    
    void m1(int a){
        System.out.println("Instance Method");
    }
    
    static void m2(String str){
        System.out.println("Static method");
    }
    
    Case4_FinalClassContains_All_Concept_Of_Class(){
        System.out.println("0-args Constructor");
    }
    
    Case4_FinalClassContains_All_Concept_Of_Class(int a){
        System.out.println("1-args cons");
    }
    {
        System.out.println("instance block");
    }
   static {
        System.out.println("Static block");
    }
    public static void main(String[] args) {
        Case4_FinalClassContains_All_Concept_Of_Class t =new Case4_FinalClassContains_All_Concept_Of_Class();
        Case4_FinalClassContains_All_Concept_Of_Class t1= new Case4_FinalClassContains_All_Concept_Of_Class(10);
        t.m1(10);
        t.m2("ashish");
    }

}
