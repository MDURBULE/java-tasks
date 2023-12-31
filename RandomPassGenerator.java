package cognifyz_level_1;

import java.security.SecureRandom;
import java.util.Scanner;

public class RandomPassGenerator {
		private boolean isNumber = false;
		private boolean isLowercase = false;
		private boolean isUppercase = false;
		private boolean isSpecialChar = false;



	
		private void permission() {
			Scanner scan = new Scanner(System.in);
			
	        System.out.print("Include numbers? (y/n): ");
	        isNumber = scan.next().equalsIgnoreCase("y");

	        System.out.print("Include lowercase letters? (y/n): ");
	        isLowercase = scan.next().equalsIgnoreCase("y");

	        System.out.print("Include uppercase letters? (y/n): ");
	        isUppercase = scan.next().equalsIgnoreCase("y");

	        System.out.print("Include special characters? (y/n): ");
	        isSpecialChar = scan.next().equalsIgnoreCase("y");
	        
	        scan.close();

			
		}
	
	    private  String generatePass(int length) {
        String lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String specialChars = "!@#$%^&*()-_+=<>?/";

        StringBuilder validChars = new StringBuilder();

        if (isLowercase) {
            validChars.append(lowercaseLetters);
        }
        if (isUppercase) {
            validChars.append(uppercaseLetters);
        }
        if (isNumber) {
            validChars.append(numbers);
        }
        if (isSpecialChar) {
            validChars.append(specialChars);
        }

        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(validChars.length());
            password.append(validChars.charAt(randomIndex));
        }

        return password.toString();
    }
	    
	private static void display(int length) {
		RandomPassGenerator rpg = new RandomPassGenerator();
        rpg.permission();
		System.out.println("New Generated Password is :- "+rpg.generatePass(length));
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        System.out.print("Enter the desired length of the password: ");
        int passLength = scan.nextInt();
        
        display(passLength);
        scan.close();
        
	}

}
