import java.util.*;

class SumanaException extends Exception {
    public SumanaException(String s) {
        
    }
}

public class CustomExpHandle {
    public static void main(String[] args) {
        int j = 0;
        int i = 0;

        try {
            j = 18 / i;
        } catch (ArithmeticException e) {
            // Handle arithmetic exception
            try {
                if (j == 0)
                    throw new SumanaException("Hi");
            } catch (SumanaException x) {
                j = 18 / 2;
                System.out.println("Exception!! " + x);
            }
        }

        System.out.println(j);
    }
}