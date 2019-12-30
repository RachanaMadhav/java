package utils;

public class AccountNotFoundException extends Exception {
	public AccountNotFoundException()
	{
		super("Account details are not available");
	}
}
