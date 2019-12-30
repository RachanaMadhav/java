package abcd;

public class ArithmaticApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithmatic arithmatic=(x,y)->{
			System.out.println("add method, lamda representation is used only if one method is present in an interface.Observe the semicolon after the braces");
			return x+y;
		};
		System.out.println(arithmatic.add(1,2));
		arithmatic.output();
	}

}
