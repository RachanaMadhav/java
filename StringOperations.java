package abcd;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Deloitte";
				System.out.println("length"+str1.length());
				System.out.println(str1.lastIndexOf('t'));
				System.out.println(str1.charAt(5));
				System.out.println(str1.isEmpty());
				System.out.println(str1.substring(3));
				System.out.println(str1.substring(3,7));
				System.out.println(str1.charAt(5));
				System.out.println(str1.toUpperCase());
				System.out.println(str1.concat(" hyderabad"));
				System.out.println(str1);
				System.out.println(str1.compareTo("Deloitte"));
				System.out.println(str1.equals("Deloitte"));
	}

}
