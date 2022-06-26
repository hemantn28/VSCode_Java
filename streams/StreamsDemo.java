package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> al=new ArrayList<>();

        al.add(0);
        al.add(10);
        al.add(20);
        al.add(5);
        al.add(15);
        al.add(25);

        // System.out.println(al);

        // List<Integer> l=new ArrayList<>();//Without Stream

        // for (Integer I1 : al) {

        //    if(I1%2==0){
        //     l.add(I1);
        //    }

        //   } System.out.println(l);

        List<Integer> l=al.stream().filter(I->I%2==0).collect(Collectors.toList());
        System.out.println(l);


    }
}
