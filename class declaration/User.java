package app;
import java.io.IOException;
import java.util.Scanner;
import java.util.InputMismatchException;

public class User {
	private String user_name;
	private String login_name;
	private String password_name;
	private boolean ban_status;
	
	public float find_information() {
		return 0;
	} 
	
	public int create_mark() throws NumberFormatException, InputMismatchException {
		boolean check = false;
		int mark;
		while(!check) {
			try {
				System.out.print("Choose the mark:");
				Scanner in = new Scanner(System.in);
				mark = in.nextInt(); 
				if (mark > 10 || mark < 0)
					throw new NumberFormatException("You entered a wrong mark");	
				check = true;
			} catch (InputMismatchException ex) {
				System.out.println("Invalid type of mark");
			}
		}
		return -1;
	} 
	
	public String setUserName() throws UserNameException { 
		String wrong_characters = ".<,>/?|]}{[=+_-():;^*&%$#@! 0123456789~`";
		System.out.print("Enter Username:");
		Scanner in = new Scanner(System.in);
		try {
			user_name = in.nextLine(); 
			char first_char = user_name.charAt(0); 
			for (int i = 0; i < wrong_characters.length(); i++)
				if (first_char == wrong_characters.charAt(i))
					throw new UserNameException("Wrong first letter");
		} catch(UserNameException e) {
			System.out.println("Invalid first letter");
		}
		return user_name;
	}
	
	public static void main(String[] args) throws UserNameException {
		User user = new User();
		
		user.create_mark();
		user.setUserName();
		
	}
}
