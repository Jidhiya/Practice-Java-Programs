package JavaPrograms;

import java.util.Scanner;

public class checkVowel {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the alphabet");
		char ch = scan.next().charAt(0);
		if ((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')) {
			System.out.println("Entered character is a vowel");
		}
		else {
			System.out.println("Entered character is a consonant");
		}
	}

}

