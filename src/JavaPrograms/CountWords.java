package JavaPrograms;

import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	   System.out.println("Enter the string");
		String str = scan.nextLine();
		//String str = "Today is a beautiful day";
		int count = str.split("\\s").length;
		System.out.println("Number of words in the given string : " + count);
		

	}

}
