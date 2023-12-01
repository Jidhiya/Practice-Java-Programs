package JavaPrograms;

import java.util.Scanner;

public class StringContainsString {

	public static void main(String[] args) {
		String str1, str2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		str1 = scan.nextLine();
		System.out.println("Enter the specified string to be checked");
		str2 = scan.nextLine();
		System.out.println(str1.contains(str2));
			
		}

	}


