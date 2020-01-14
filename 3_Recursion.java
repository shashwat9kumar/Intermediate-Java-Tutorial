
public class Recursion {

	public static void main(String[] args) {
		
		System.out.println(fact(20));
		
	}
	
	
	
	//factorial method usin recursion
	
	public static long fact(long n)
	{
		if(n<=1)
			return 1;          // base case;
		else
			return n*fact(n-1);        // function calls are stored
	}

}
