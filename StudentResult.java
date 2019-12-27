package abcd;
import java.util.*;
public class StudentResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sub1=sc.nextInt();
		int sub2=sc.nextInt();
		int sub3=sc.nextInt();
		String regno=sc.next();
		int total=(sub1+sub2+sub3)/3;
		int average=total/3;
		System.out.println("registration number of student is"+regno);
		if(sub1>=40&&sub2>=40&&sub3>=40)
			System.out.println("pass");
		else
			System.out.println("fail");
	}

}
