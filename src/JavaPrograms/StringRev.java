package JavaPrograms;

import java.util.Scanner;

public class StringRev {

	public static void main(String[] args) {
		
		//using String in built methods
		System.out.println("Using String in built functions");
		String str, rev ="" ;
		Scanner scan = new Scanner(System.in);		
		System.out.println("Enter the string");
		str = scan.next();
		System.out.println("Input String :" + str);
		for (int i = str.length()-1; i>=0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println("Reversed String :" + rev);
		
		//using String builder class
		System.out.println("\nUsing String Builder class");
		System.out.println("Enter the string");
		String str1 = scan.next();
		StringBuilder str2 = new StringBuilder();
		str2.append(str1);
		System.out.println("Input String :" + str2);
		str2 = str2.reverse();
		System.out.println("Reversed String :" + str2);
		
		
		
		
	}

}
