package generics;

import java.util.ArrayList;

public class ArrayListGenerics {
    
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();

        arrayList.add("Sachin");
        arrayList.add(54);
        arrayList.add(643);

        int a=(int) arrayList.get(2);
        System.out.println(a);
    }
}
