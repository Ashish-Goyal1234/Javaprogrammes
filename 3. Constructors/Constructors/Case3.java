package Constructors;


public class Case3 {
    int eid;
    String ename;
    float esal;
    
    Case3(){
        eid = 1001;
        ename = "ashish";
        esal =100.5f;
    }
    void disp(){
        System.out.println("Employee id :" + eid);
        System.out.println("Employee nam :" + ename);
        System.out.println("Employee salary :" + esal);
    }
    public static void main(String[] args) {
        Case3 t = new Case3();
        t.disp();
    
    }
 
    

}
