package utils;

import java.util.Scanner;

public class AccountApplication {

	public static void main(String[] args) {
		AccountOperations oper = new AccountOperations();
		int k=1;
		while(k!=2){
			System.out.println("1:Deposit");
			System.out.println("2:Withdraw");
			System.out.println("3:Check Balance");
			System.out.println("4:Exit");
			Scanner sc=new Scanner(System.in);
			int i=sc.nextInt();
			switch(i){
				case 1:oper.deposit(sc.nextInt(),sc.nextInt());
					break;
				case 2:oper.withdraw(sc.nextInt(),sc.nextInt());
					break;
				case 3:oper.checkBalance(sc.nextInt());
					break;
				case 4:k++;
					break ;
						
			}
			
		}
		//exit: System.out.println("End of Transactions");
	}

}
