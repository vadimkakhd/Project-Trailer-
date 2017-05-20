package app;

public class UserNameException extends Exception {
	public UserNameException(String message) {
		super(message);
		System.out.println("You entered a wrong Username");
	}
}
