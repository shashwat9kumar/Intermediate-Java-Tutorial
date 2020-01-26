import java.util.*;
import java.util.List;
//import java.util.List;
public class LinkedList {

	public static void main(String[] args) {
		
		
		String things[]= {"apples","noobs","pwnge","bacon","goats"};
		List<String> list1 = new java.util.LinkedList<String>();
		 
		
		
		for(String x:things)
		{
			list1.add(x);
		}
		
		String things2[]= {"sausage","bacon","goats","harrypotter"};
		List<String> list2= new java.util.LinkedList<String>();
		
		for(String y:things2)
		{
			list2.add(y);
		}
		
		
		System.out.println(list1);
		System.out.println(list2);
		
		
		list1.addAll(list2);
		list2=null;
		
		System.out.println(list1);
		System.out.println(list2);
		
		
		
		printMe(list1);
		removeStuff(list1,2,5);
		printMe(list1);
		reverseMe(list1);
		reverseMeNo(list1);

	}
	
	
	
	
	
	// printMe Method
	
	
	private static void printMe(List<String> l)
	{
		for(String b: l)
			System.out.printf("%s ",b);
		System.out.println();
	}
	
	
	
	
	//removeStuff method
	
	
	private static void removeStuff(List<String> l, int from, int to)
	{
		l.subList(from, to).clear();
	}
	
	
	
	
	//reverseMe method
	
	
	private static void reverseMe(List<String> l)   
	{
		ListIterator<String> shash=l.listIterator(l.size());
		while(shash.hasPrevious())
			System.out.print(shash.previous()+" ");
		System.out.println();
	}
	
	private static void reverseMeNo(List<String> l)    // method to print in the straignt order
	{
		System.out.println(l.size());
		ListIterator<String> shash=l.listIterator(0);
		while(shash.hasNext())
			System.out.print(shash.next()+" ");
	}

}
