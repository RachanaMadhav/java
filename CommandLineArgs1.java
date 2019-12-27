package abcd;

public class CommandLineArgs1 {
	 public static void main(String args[]){
		 String str=args[0];
		 for(int i=0;i<str.length();i++)
			 System.out.println(str.charAt(i));
			 System.out.println();
		String str1=args[1];
		StringBuffer buf=new StringBuffer();
		for(int j=0;j<str1.length();j++){
			buf.append(str1.charAt(j));
			System.out.println(buf);
		}
		 }
	 }

