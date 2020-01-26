import java.util.*;
import java.util.List;
public class LinkedList {

	public static void main(String[] args) {
		
		
		String things[]= {"apples","noobs","pwnge","bacon","goats"};
		List<String> list1 = new java.util.LinkedList<String>();    // the statement List<String> list1 = new LinkedList<String>() didn't work 
		 
		
		
		for(String x:things)
		{
			list1.add(x);   // to add elements to the list 1
		}
		
		String things2[]= {"sausage","bacon","goats","harrypotter"};
		List<String> list2= new java.util.LinkedList<String>();
		
		for(String y:things2)
		{
			list2.add(y);
		}
		
		
		System.out.println(list1);
		System.out.println(list2);
		
		
		list1.addAll(list2);      // to add complete list list2 to list1
		list2=null;                    // making list2 null thereby saving memory
		
		System.out.println(list1);
		System.out.println(list2);
		
		
		
		/*printMe(list1);                  // to be built later
		removeStuff(list1,2,5);
		printMe(list1);
		reverseMe(list1);*/

	}

}


