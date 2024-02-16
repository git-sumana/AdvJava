import java.util.*;
public class SetEx
{
	public static void main(String[] args) {
		
		Collection<String> num=new HashSet();
		num.add("Hi");
		num.add("Sumana");
		num.add("Datta");
		num.add("Kapavarapu");
		System.out.println(num);
		
		for(String n: num)
		    System.out.println(n);
		
		Collection<String> s=new TreeSet(num);
		System.out.println(s);
	}
}