package parallel_stream;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamDemo {
    
    public static void main(String[] args) {
        
          List<Integer> listOfNumbers=Arrays.asList(21,52,41,47,48,59,63);
          listOfNumbers.parallelStream().forEach(number->System.out.println(number + " " + Thread.currentThread().getName()));
    }
}
