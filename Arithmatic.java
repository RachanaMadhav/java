package abcd;

public interface Arithmatic {
	int add(int x,int y);
	default void output(){
		System.out.println("this is default method,the only method that can have body in an interface");
	}
}
