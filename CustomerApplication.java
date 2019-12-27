package abcd;

public class CustomerApplication {
 public static void main(String args[]){
	 Customer customer=new Customer();
	 customer.setCustomerId(1234);
	 customer.setCustomerName("Dega");
	 customer.setCity("Hyderabad");
	 System.out.println(customer.getCustomerId());
	 System.out.println(customer.getCity());
	 System.out.println(customer.getCustomerName());
 }
}
