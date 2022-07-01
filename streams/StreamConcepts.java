package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamConcepts {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> arrayList=new ArrayList<>();

        arrayList.add(10);
        arrayList.add(12);
        arrayList.add(15);
        arrayList.add(18);
        arrayList.add(20);
        arrayList.add(25);

        System.out.println("Getting even numbers from the list thru stream concept");
        List<Integer> list=arrayList.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(arrayList);
        System.out.println(list);

        System.out.println();
        System.out.println("Getting odd numbers from the list thru stream concept");
        List<Integer> list3=arrayList.stream().filter(i->i%2!=0).collect(Collectors.toList());
        System.out.println(arrayList);
        System.out.println(list3);

        System.out.println();
        List<Integer> list2=arrayList.stream().map(i->i*2).collect(Collectors.toList());
        System.out.println(arrayList);
        System.out.println(list2);
    }
}
