package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DemoStreams {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> arrayList=new ArrayList<>();

        arrayList.add(0);
        arrayList.add(50);
        arrayList.add(550);
        arrayList.add(33);
        arrayList.add(47);
        arrayList.add(69);

        //System.out.println(arrayList);

      /*  List<Integer> list=new ArrayList<>();//Without Stream 

        for(Integer I1: arrayList){
            list.add(I1*2);
            
        }
        System.out.println(list);*/

        //With Stream

        List<Integer> list=arrayList.stream().map(I->I*2).collect(Collectors.toList());
        System.out.println(list);
       

    }
}
