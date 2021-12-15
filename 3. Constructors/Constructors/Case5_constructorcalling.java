package Constructors;


public class Case5_constructorcalling {
    Case5_constructorcalling(){
        this(10);
        //this(10);  //not allowd this must be first statement in constructor.
        System.out.println("0-args constructor");
        //this(10);  //not allowd this must be first statement in constructor.
    }
    
    Case5_constructorcalling(int a ){
        this(10,20);
        //this(10);  //not allowd this must be first statement in constructor., one canstructor is able to call only 1 constructor at a time.
        System.out.println("1 args constructor");
        //this(10,20); //not allowd this must be first statement in constructor.
    }
    
    Case5_constructorcalling(int a, int b){
        System.out.println("2 args constructor");
    }
    public static void main(String[] args) {
        Case5_constructorcalling t =new Case5_constructorcalling();
    }

}
