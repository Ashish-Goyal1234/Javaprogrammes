package Constructors;


public class Case4 {
    int eid;
    String ename;
    float esal;
    
    Case4(int eid, String ename, float esal){
        this.eid=eid;
        this.ename=ename;
        this.esal=esal;
    }
    
    void disp(){
        System.out.println(eid);
        System.out.println(ename);
        System.out.println(esal);
    }
    
    public static void main(String[] args) {
        Case4 t = new Case4(1001,"Ashish", 100.5f);
        t.disp();
        
        Case4 t1 = new Case4(2002,"Test",500.2f);  
        t1.disp();
        
            
            
    }

}
