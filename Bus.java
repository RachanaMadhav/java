package abcd;

public class Bus implements Vehicles{
	public static void main(String args[]){
	Vehicles vehicle=new Bus();
	vehicle.wheels();
	vehicle.engines();
}	
	@Override
	public void wheels() {
		// TODO Auto-generated method stub
		System.out.println("No.of wheels=6");
	}

	@Override
	public void engines() {
		// TODO Auto-generated method stub
		System.out.println("No.of engines=1");
		
	}

}
