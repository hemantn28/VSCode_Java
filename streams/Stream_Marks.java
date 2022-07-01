package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_Marks {
    public static void main(String[] args) {
        
        ArrayList<Integer> marks=new ArrayList<>();

        marks.add(58);
        marks.add(63);
        marks.add(91);
        marks.add(75);
        marks.add(70);
        marks.add(95);
        marks.add(55);

        System.out.println(marks);

        List<Integer> updatedMarks=marks.stream().map(i->i+5).collect(Collectors.toList());
        System.out.println(updatedMarks);
    }
}
