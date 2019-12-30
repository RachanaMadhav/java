package utils;

public class AccountOperations {
	Account[] accounts = new Account[5];
	public AccountOperations() {
		accounts[0] = new Account(10011, "deloitte", 8000);
		accounts[1] = new Account(10012, "Dobbby", 3000);
		accounts[2]=new Account(10013,"Bablu",4500);
		accounts[3] = new Account(10014,"Sonia",25000);
		accounts[4]=new Account(10015,"Simram",700030);
 	}
	void deposit(int acno,double amount){
		int count=0;
		for(int i=0;i<5;i++){
			if(acno==accounts[i].getAccno()){
				accounts[i].setBalance(accounts[i].getBalance()+amount);
			System.out.println("Balance After deposit is "+accounts[i].getBalance());
			System.out.println();
			count++;
			}
			
		}
		try{
			if(count!=1)
			throw new AccountNotFoundException();
		}
		catch(AccountNotFoundException e){
			System.out.println(e.getMessage());
		}
		
	}
	void withdraw(int acno,double amount){
		int count=0;
		try{
		for(int i=0;i<5;i++){
			if(acno==accounts[i].getAccno()){
					if(accounts[i].getBalance()<amount)
					throw new InsufficientBalanceException();
				else{
				accounts[i].setBalance(accounts[i].getBalance()-amount);
				System.out.println("Balance After Withdrawal is "+accounts[i].getBalance());
				System.out.println();
				count++;
				}
				}
				
		}
		if(count!=1)
			throw new AccountNotFoundException();
		}
			catch(InsufficientBalanceException e){
				System.out.println(e.getMessage());
			}
		catch(AccountNotFoundException e){
			System.out.println(e.getMessage());
		}
		
	}
	void checkBalance(int acno){
		int count=0;
		for(int i=0;i<5;i++){
			if(acno==accounts[i].getAccno()){
			System.out.println("Availabale Balance is "+accounts[i].getBalance());
			System.out.println();
			count++;}
			
		}
		try{
			if(count!=1)
			throw new AccountNotFoundException();
		}
		catch(AccountNotFoundException e){
			System.out.println(e.getMessage());
		}
	}
}
