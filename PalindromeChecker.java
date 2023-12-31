package cognifyz_level_1;

import java.util.Scanner;

public class PalindromeChecker {
	
	private boolean isPalindrome(String word) {
        String Str = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
        
        int left = 0;
        int right = Str.length() - 1;

        while (left < right) {
            if (Str.charAt(left) != Str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
		
	}
	
	private void display(String word) {
		if(isPalindrome(word)) {
			System.out.println("The '"+ word +"' word is palindrome ");
		}
		else {
			System.out.println("The '"+word +"' word is not palindrome ");
		}
		
	}

	public static void main(String[] args) {
		PalindromeChecker pc = new PalindromeChecker();
		System.out.println("Palindrome Checker");

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word or phrase :- ");
		String word = scan.nextLine();
		pc.display(word);
			
		scan.close();
		

	}
}


