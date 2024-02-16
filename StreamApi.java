import java.util.stream.*;
import java.util.*;

public class StreamApi {
    public static void main(String[] args) {
        
        List<Integer> num = Arrays.asList(4, 5, 2, 3); 
        
        // Original stream
        Stream<Integer> s = num.stream();
        s.forEach(n -> System.out.println(n)); // Print original stream
        
        System.out.println();
        
        // Stream for filtering even numbers
        Stream<Integer> s2 = num.stream().filter(n -> (n % 2 == 0));
        s2.forEach(n -> System.out.println(n)); // Print stream of even numbers
        System.out.println();
        
        // Stream for mapping each element to its double
        Stream<Integer> s3 = num.stream().map(n -> n * 2);
        s3.forEach(n -> System.out.println(n)); // Print stream of doubled numbers
    }
}
