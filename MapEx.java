import java.util.*;

public class MapEx
{
	public static void main(String[] args) {
		
		Map<String, Integer> num=new HashMap();
		num.put("Sumana",10);
		num.put("Messi",30);
		num.put("Suarez",9);
		num.put("Neymar",11);
		 
		System.out.println(num);
		
		for(Map.Entry<String, Integer> n: num.entrySet())
		    System.out.println(n);
		
		System.out.println();
		
		Map<String, Integer> tm=new TreeMap(num);
		System.out.println(num);
		for(Map.Entry<String,Integer> en: tm.entrySet())
		    System.out.println(en);
	}
}