import java.util.*;
public class MulCatch
{
	public static void main(String[] args) {
	    int j=0; int i = 0;
	    int nums[]=new int[5];
	    Scanner s=new Scanner(System.in);
	    i=s.nextInt();
	    
	    try{
	        j=18/i;
	        System.out.println(nums[6]);
	    }
	    
	    catch(ArithmeticException x){
	        System.out.println("Div / 0 not possible !" );
	    }
	    
	    catch(ArrayIndexOutOfBoundsException ob){
	        System.out.println(ob);
	    }
	    
	    catch(Exception obj){
	        System.out.println("Something Went Wrong!!" + obj);
	    }
        System.out.println(j);

	}
}
