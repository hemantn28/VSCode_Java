package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        
        //create a list and filter all even numbers from list

        List<Integer> list=new ArrayList<>();

        list.add(25);
        list.add(55);
        list.add(74);
        list.add(36);
        list.add(18);
        list.add(50);
        list.add(33);

        System.out.println(list);

        ArrayList<Integer> list2=new ArrayList<>();

        for(Integer i: list){
            if(i%2==0){
                list2.add(i);
            }
        }System.out.println(list2);

        //Using stream api

        list.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(list2);
    }
}
