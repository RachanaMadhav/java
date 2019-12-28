package abcd;

public class Rectangle extends Shape {
		public Rectangle(int length,int breadth) {
		super(length, breadth);
		// TODO Auto-generated constructor stub
	}

	@Override
	void area() {
		// TODO Auto-generated method stub
		System.out.println("Area of Rectangle is"+(length*breadth));
	}

	public static void main(String args[]){
		int length=Integer.parseInt(args[0]);
		int breadth=Integer.parseInt(args[1]);
		Rectangle rectangle=new Rectangle(length,breadth);
		rectangle.area();
	}
}
