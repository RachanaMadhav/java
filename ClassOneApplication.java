package abcd;

public class ClassOneApplication extends ClassOne {

	public ClassOneApplication(int x, int y) {
		super(x, y);
		}

	public static void main(String[] args) {
		ClassOne one=new ClassOneApplication(5,6);
		one.output();
		one.display();
	}

	@Override
	void output() {
		// TODO Auto-generated method stub
		System.out.println("x="+x+" "+"y="+y);
	}

}
