package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI_Demo {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> al=new ArrayList<>();

        al.add(10);
        al.add(15);
        al.add(18);
        al.add(25);
        al.add(35);
        al.add(40);

        System.out.println("Even n umbers from list using stream api");
        List<Integer> l=al.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(al);
        System.out.println(l);


        System.out.println();
        System.out.println("Odd numbers from list using stream api");
        List<Integer> l1=al.stream().filter(i->i%2!=0).collect(Collectors.toList());
        System.out.println(al);
        System.out.println(l1);
    }
}
