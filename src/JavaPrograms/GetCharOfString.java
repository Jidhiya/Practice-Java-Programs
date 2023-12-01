package JavaPrograms;

import java.util.Scanner;

public class GetCharOfString {

	public static void main(String[] args) {
		String str;
		int index;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		str = scan.nextLine();
		System.out.println("Enter the index value");
		index = scan.nextInt();
		for(int i=0; i<=str.length()-1; i++) {
				if(i==index) {		
				char ch = str.charAt(i);
				System.out.println("The character at index "+ index + " is : " + ch);
			}
		}

	}

}
