package JavaPrograms;

import java.util.Scanner;

public class checkPalindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string :");
		String str , rev ="";
		str = scan.next();
		int strlength = str.length();
		//System.out.println(strlength); 
		for(int i = strlength -1; i>=0 ; i--) {
			rev = rev +str.charAt(i);
		}
			if (str.equals(rev)) {
				System.out.println(str + " is a palindrome");
			}
			else {
				System.out.println(str + " is not a palindrome");
			}
		
		
		
	}

}
