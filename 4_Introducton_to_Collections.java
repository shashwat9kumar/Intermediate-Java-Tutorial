import java.util.*;
public class Introduction_to_Collections {

	public static void main(String[] args) {
		String[] things1 = {"eggs","lasers","hats","pie"};
		List<String> list1 = new ArrayList<String>();
		
		
		// add array items to list
		
		
		for(String x : things1)              // adding elements to array List
		{
			list1.add(x);
		}
		
		
		
		String[] things2 = {"lasers","hats"};
		List<String> list2 = new ArrayList<String>();
		
		
		
		for(String x : things2)
		{
			list2.add(x);
		}
		
		
		
		
		for(int i=0;i<list1.size();i++)             // Printing array list
		{
			System.out.print(list1.get(i)+ " ");
		}
		System.out.println();
		for(int i=0;i<list2.size();i++)
		{
			System.out.print(list2.get(i)+ " ");
		}
		
		
		
		
		System.out.println(list1);               // Another way of printing the ArrayList
		System.out.println(list2);
		
		
	}

}
