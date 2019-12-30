package utils;

public class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(){
		super(" Insuffiecient balance found in the account");
	}
}
