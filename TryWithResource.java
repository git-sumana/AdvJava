import java.io.*;
public class TryWithResource
{
	public static void main(String[] args) throws IOException{
	    
	    int i=0; int j=0;
	    
	    try(BufferedReader bf=new BufferedReader(new InputStreamReader(System.in))){
	        i=Integer.parseInt(bf.readLine());
	        j=18/i;
	        
	    }
	    
	    catch(Exception e){
	        
	        System.out.println("Bye!" + e);
	        
	    }
	    
	    finally{
	        
	        System.out.println("This is always Executed!");
	        //bf.close 
	    }
		
		
	}
}
