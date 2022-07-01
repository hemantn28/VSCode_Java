package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMappedObject {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> arrayList=new ArrayList<>();

        arrayList.add(12);
        arrayList.add(25);
        arrayList.add(20);
        arrayList.add(18);
        arrayList.add(33);
        arrayList.add(50);

        System.out.println(arrayList);

        //Without stream double the value of elements.

        List<Integer> list=new ArrayList<>();

        for(Integer i: arrayList){
            list.add(i*2);

            }System.out.println(list);

            //With Stream

            List<Integer>list2=arrayList.stream().map(i->i*2).collect(Collectors.toList());
            System.out.println(list2);
        }
    }

