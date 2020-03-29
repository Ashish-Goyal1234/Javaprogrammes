package StringManipulation;


public class Case5_Ex3 {

    public static void main(String[] args) {
        Case5_Ex3 t = new Case5_Ex3();
        System.out.println(t);  //O/p classname and hashcode
        System.out.println(t.toString()); //O/p classname and hashcode
        
        
        String s = new String("Ashish");
        System.out.println(s);    //O/p Ashish
        System.out.println(s.toString());   //Ashish
        
        StringBuffer sb = new StringBuffer("Ashish");
        System.out.println(sb);  //O/p Ashish
        System.out.println(sb.toString());  //O/p Ashish
    }

}
