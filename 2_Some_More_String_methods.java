public class SomeMoreStringMethods {

	public static void main(String[] args) {
	       String s= "shashwatkumarshashwatkumar";
		
		System.out.println(s.indexOf('h'));
		System.out.println(s.indexOf('h',10));
		System.out.println(s.indexOf("shw"));
		System.out.println(s.indexOf("shw",10));
		System.out.println(s.indexOf("shit"));
		System.out.println(s.indexOf('x'));
		System.out.println(s.indexOf("shw",17));
		
		
		
		String a="Bacon ";
		String b="      Monster      ";
		
		System.out.println(a+b);
		
		String con=a.concat(b);
		System.out.println(con);
		
		
		
		String rep=a.replace('B','T'); 
		System.out.println(a.replace('B','T'));
		System.out.println(rep);
		
		
		
		System.out.println(b.toUpperCase());
		System.out.println(b);
		System.out.println(b.toLowerCase());
		
		
		System.out.println(b);
		System.out.println(b.trim());
		System.out.println(b);
	}

}
