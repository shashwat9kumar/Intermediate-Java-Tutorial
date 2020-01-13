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
	}

}
