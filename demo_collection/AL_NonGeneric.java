package demo_collection;

import java.util.ArrayList;

public class AL_NonGeneric {
    public static void main(String[] args) {
        
        ArrayList arrayList=new ArrayList();

        arrayList.add(25);
        arrayList.add("Shiva");
        arrayList.add(25.5);
        arrayList.add('A');
        arrayList.add("Ram");
        arrayList.add(18);

        //System.out.println(arrayList);

        double a=(double)arrayList.get(2);
        System.out.println(a);

        String s=(String)arrayList.get(1);
        System.out.println(s);
    }
}
