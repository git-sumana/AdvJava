@FunctionalInterface
interface A{
    void provide(int l_amt);
}

public class LambdaEx
{
	public static void main(String[] args) {
	    A f= l_amt -> 
	    {
	            System.out.println(l_amt);
	            System.out.println("Anonymous Class and Lambda");
	        };
	    f.provide(10000);
	}
}
