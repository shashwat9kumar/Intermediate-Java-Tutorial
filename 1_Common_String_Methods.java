public class CommonStringMethod {

	public static void main(String[] args) {
		String words[]= {"funk","chunk","furry","backonator"};
		
		
		//startsWith function in String
		
		for(String w : words)
		{
			if(w.startsWith("fu"))
			{
				System.out.println(w + " Starts with fu");
			}
		}
		
		//endsWith function in String
		
		for(String w : words)
		{
			if(w.endsWith("unk"))
			{
				System.out.println(w + " Ends with unk");
			}
		}

	}

}

