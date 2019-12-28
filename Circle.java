package abcd;

public class Circle extends Shape{
		final double pi=3.14;
	public Circle(int radius) {
		super(radius);
			}
	@Override
	void area() {
		System.out.println("Area of circle="+(pi*radius*radius));
	}
	public static void main(String args[]){
		int radius=Integer.parseInt(args[0]);
		Circle circle=new Circle(radius);
		circle.area();
	}

}
