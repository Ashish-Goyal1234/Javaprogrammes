package cloningProcess;

import java.util.ArrayList;

public class cloningArrayList {

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add("ratan");
        a.add("anu");
        a.add("durga");
        System.out.println(a);
        /*
         *  1. By defaulr all collection classes implementes cloneable and serializable interface.
         *  2. In below exaple we type cast into arraylist because return type of clone() is object class.
         */
       ArrayList<String> copy =  (ArrayList<String>)a.clone();
       System.out.println(copy);
    }

}
