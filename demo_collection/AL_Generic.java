package demo_collection;

import java.util.ArrayList;

public class AL_Generic {
    
    public static void main(String[] args) {
        
        ArrayList l=new ArrayList();

        l.add("Ravi");
        l.add("Durga");
        l.add(10);

        String s=(String)l.get(2);
        System.out.println(l);

    }
}
