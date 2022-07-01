package parallel_stream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class StreamPerformanceParallel {
    public static void main(String[] args) {
        int loop=20;
        long result=measureperformance(StreamPerformanceParallel:: sumSequentialStream,loop);
        System.out.println("Time taken to process sum in sequential : "+result + "in msecs");
        result=measureperformance(StreamPerformanceParallel:: sumParallelStream,loop);
        System.out.println("Time taken to process sum in parallel: "+ result +" in msecs");
        
    }

    public static long measureperformance(Supplier<Integer> supplier, int numberOfTimes){
        long startTime=System.currentTimeMillis();
        
        for(int i=0; i<numberOfTimes; i++)
         supplier.get();
        return System.currentTimeMillis() - startTime; 
    }
    public static int sumSequentialStream(){
        return IntStream.rangeClosed(0, 500).sum();
    }

    public static int sumParallelStream(){
        return IntStream.rangeClosed(0, 500).parallel().sum();
    }
}
