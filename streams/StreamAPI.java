package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        
        ArrayList<Integer> arrayList=new ArrayList<>();

        arrayList.add(0);
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(5);
        arrayList.add(15);
        arrayList.add(25);

        System.out.println(arrayList);

        //without stream until 1.7 ver

        List<Integer> list=new ArrayList<>();

        for(Integer i: arrayList){
            if(i%2==0){
                list.add(i);
            }
            
    
        }System.out.println(list);

        //With Stream
  
        
        List<Integer> list1=arrayList.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(list1);
    }
}
