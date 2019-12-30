package abcd;

public class Aeroplane implements Vehicles {
	public static void main(String args[]){
	Vehicles aeroplane=new Aeroplane();
	aeroplane.wheels();
	aeroplane.engines();
}
@Override
	public void wheels() {
		// TODO Auto-generated method stub
		System.out.println("no.of wheels=6");
	}

	@Override
	public void engines() {
		// TODO Auto-generated method stub
		System.out.println("no.of engines=2");
	}

	}
