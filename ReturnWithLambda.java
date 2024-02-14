@FunctionalInterface
interface A{
    void add(int x, int y);
}

public class ReturnWithLambda
{
	public static void main(String[] args) {
	    A f= (x,y) -> 
	    {
	            System.out.println(x+y);
	            System.out.println("Anonymous Class, Two variables with return value and Lambda");
	        };
	    f.add(100,10);
	    
	    //More Simple form to reduce the lines of code
	    A addition=(x,y) -> System.out.println(x+y);
	    addition.add(44,101);
	}
}
