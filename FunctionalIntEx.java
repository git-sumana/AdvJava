@FunctionalInterface
interface FinMkt{
    void provide();
}
/*
class FinFi implements FinMkt{
    public void provide(){
        System.out.println("Loan Provided");
    }
    
} */
public class FunctoinalIntEx
{
	public static void main(String[] args) {
	    FinMkt f=new FinMkt(){
	        public void provide(){
	            System.out.println("Loan Sanctioned");
	        }
	    };
	    f.provide();
	}
}
