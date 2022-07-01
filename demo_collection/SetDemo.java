package demo_collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        
        Set<String> set=new HashSet<>();

        set.add("Ram");
        set.add("Shiva");
        set.add("");
        set.add("Ram");
        set.add("");

        System.out.println(set);
    }
}
