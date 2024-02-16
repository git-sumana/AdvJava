import java.util.*;
public class ForEach
{
	public static void main(String[] args) {
		
//		int sum=0;
		List<Integer> num=Arrays.asList(4,5,2,3);
		
		num.forEach(n-> System.out.println(n));
		
//		for(int i=0;i<num.size();i++)   System.out.println(num.get(i));
		
// 		for(int n: num){
// 		    if(n%2==0)  sum+=n;
// 		}
// 		System.out.println(sum);
		}
}