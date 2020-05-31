package DifferentTypesOfException;

import java.util.ArrayList;
import java.util.Collections;

public class classCastException {

    public static void main(String[] args) {
        ArrayList al =new ArrayList();
        al.add(10);
        al.add("ashish");
        Collections.sort(al);
    }

}
