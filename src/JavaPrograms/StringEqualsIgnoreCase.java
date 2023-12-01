package JavaPrograms;

import java.util.Scanner;

public class StringEqualsIgnoreCase {

	public static void main(String[] args) {
		String str1, str2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first string");
		str1 = scan.nextLine();
		System.out.println("Enter the second string");
		str2 = scan.nextLine();
		System.out.println(str1.equalsIgnoreCase(str2));

	}

}
