package demo_collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    
    public static void main(String[] args) {
        
        List<String> list=new ArrayList<>();

        list.add("Ram");
        list.add("");
        list.add("");
        list.add("Ram");
        list.add("Shiva");

         System.out.println(list);

        // for(String var: list){
        //     System.out.println(var);
        // }

       


    }
}
