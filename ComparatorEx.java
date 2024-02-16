import java.util.*;
public class ComparatorEx
{
	public static void main(String[] args) {
		
		List<Integer> num=new ArrayList();
		num.add(4);
		num.add(11);
		num.add(2003);
		num.add(25);
		num.add(10);
		
		Comparator<Integer> com= (i,j) ->{
		        if(i%10>j%10)
		            return 1;
		        else
		            return -1;
		};
		
		//or
        /*
        Comparator<Integer> com= new Comparator<>(){
            public int compare(Integer i, Integer j){
                
                logic same!
                
            }
        }
        
        */
		Collections.sort(num, com);
		
		System.out.println(num);
		}
}