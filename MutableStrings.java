package abcd;

public class MutableStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb1=new StringBuffer();
		sb1.append("deloitte");
		System.out.println(sb1);
		sb1.append("Hyderabad");
		System.out.println(sb1);
		System.out.println(sb1.length());
		System.out.println(sb1.delete(2,5));
		System.out.println(sb1.reverse());
		System.out.println(sb1.replace(5, 9, "Hyd"));
		String str="dabang";
	}

}
