package cognifyz_level_2;
import java.util.Scanner;

public class PassStrengthChecker {
	
	private boolean passStreangthChecker(String pass) {
		boolean flag = false;
		if(!(pass.matches("(?=.*[a-z]).*"))) {
			flag = true;
		}
		if(!(pass.matches("(?=.*[A-Z]).*"))) {
			flag = true;
		}
		if(!(pass.matches("(?=.*[0-9]).*"))) {
			flag = true;
		}
		if(!(pass.matches("(?=.*[!@#$%^&*()-_+=<>?/{}|]).*"))) {
			flag = true;
		}
		return flag;
	}
	private static void display(String pass) {
		PassStrengthChecker psc = new PassStrengthChecker();
		if(psc.passStreangthChecker(pass)) {
			System.out.println("Password is too weak");
			System.out.println("Password must contain at least one lowecase and uppercase alphabet , numbers and special charecter ");
		}
		else {
			System.out.println("Password is Storng ! ");
		}
		
	}
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String password;
	
		System.out.print("Enter your password :-");
		password = scan.nextLine();
		if(password.length()>=6) {
			display(password);
		}else {
			System.out.println("Password is too weak! Password must should be 6 letters");
			System.out.print("Please Re-");
		}
	
		scan.close();
	}

}
