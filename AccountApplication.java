package abcd;

public class AccountApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account=new Account();
		Account account1=new Account(2345,"Dingo",23456);
		Account account2=new Account(2377,"Bingu");
		Account account3=new Account(6788);
		account.setAccountNumber(1123);
		account.setCustomerName("Dodong");
		account.setBalance(60000);
		System.out.println(account.getAccountNumber());
		System.out.println(account.getCustomerName());
		System.out.println(account.getBalance());
		System.out.println(account1.getAccountNumber());
		System.out.println(account1.getCustomerName());
		System.out.println(account1.getBalance());
		System.out.println(account2.getAccountNumber());
		System.out.println(account2.getCustomerName());
		System.out.println(account2.getBalance());
		System.out.println(account3.getAccountNumber());
		System.out.println(account3.getCustomerName());
		System.out.println(account3.getBalance());
	}

}
