package abcd;

public class CommandLineArgs3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=args[0];
		StringBuffer s= new StringBuffer();
		StringBuffer s3=new StringBuffer();
		s.append(s1);
		s.reverse();
		s3.append(s1);
		if(s3.equals(s))
			System.out.println("given string is palindrome");
		else
			System.out.println("not a palindrome");
		
	}

}
