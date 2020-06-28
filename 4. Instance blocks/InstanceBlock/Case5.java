package InstanceBlock;


public class Case5 {

    int eid;
    {
        eid = 111;
    }
    void disp(){
        System.out.println(eid);
    }
    public static void main(String[] args) {
        new Case5().disp();
    }

}
