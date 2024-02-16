
import java.util.*;
public class Collection_Exception {
    public static Map<Integer, Integer> countElements(int[] inputArray) {
        Map<Integer, Integer> elementCounts = new HashMap<>();

        try {
            if (inputArray == null || inputArray.length == 0) {
                throw new Exception();
            }

            for (int element : inputArray) {
                if (elementCounts.containsKey(element)) {
                    elementCounts.put(element, elementCounts.get(element) + 1);
                } else {
                    elementCounts.put(element, 1);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return elementCounts;
    }

    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 1, 2, 4, 1, 2, 3, 4, 5};

        Map<Integer, Integer> counts = countElements(inputArray);
        System.out.println("Input Array: " + Arrays.toString(inputArray));
        System.out.println("Element Counts:");
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}