import java.util.stream.*;
import java.util.*;

public class MapFilterReduce {
    public static void main(String[] args) {
        
        List<Integer> num = Arrays.asList(4, 5, 2, 3); 
        
        // Original stream
        int res= num.stream()
                    .filter(n -> (n%2==0))
                    .map(n -> n*2)
                    .reduce(0, (c,e) -> c+e);
                    
        System.out.println(res);
        }
}
