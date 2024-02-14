public class DivByZeroEx
{
	public static void main(String[] args) {
	    int j=0; int i = 0;
	    
	    try{
	        j=18/i;
	    }
	    
	    catch(Exception obj){
	        System.out.println("Something Went Wrong!!");
	    }
        System.out.println(j);
        System.out.println("Final Block");

	}
}
