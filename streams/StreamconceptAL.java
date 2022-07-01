package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamconceptAL {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> al=new ArrayList<>();

        al.add(27);
        al.add(10);
        al.add(35);
        al.add(25);
        al.add(36);
        al.add(44);
        
        System.out.println(al);

        // for(Integer var: al){
        //     System.out.println(var);
        // }

        //Without Stream

      /*  List<Integer> l=new ArrayList<>();

        for(Integer i:al){
            if(i%2==0){
                l.add(i);
            }
        }System.out.println(l);*/

        //With Stream

        System.out.println("Even numbers from list using stream method");
        List<Integer> l2=al.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(l2);

        System.out.println("Odd numbers from list using stream method");
        List<Integer> l3=al.stream().filter(i->i%2!=0).collect(Collectors.toList());
        System.out.println(l3);

        System.out.println("Double numbers from list using stream method");
        List<Integer> l4=al.stream().map(i->i*2).collect(Collectors.toList());
        System.out.println(l4);

        System.out.println("Tripple numbers from list using stream method");
        List<Integer> l5=al.stream().map(i->i*3).collect(Collectors.toList());
        System.out.println(al);
        System.out.println(l5);


        System.out.println();
        System.out.println("Double numbers from list using without stream method");
        List<Integer> l6=new ArrayList<>();

        for (Integer var:al) {
            l6.add(var*2);
        }System.out.println(l6);



        
    }
}
