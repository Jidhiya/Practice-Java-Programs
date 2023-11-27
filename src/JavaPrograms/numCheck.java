package JavaPrograms;

import java.util.Scanner;

public class numCheck {
	
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		if (num==0) {
			System.out.println("Number is 0");
		}
		else if(num>0) {
			System.out.println("Number is positive");
		}
		else {
			System.out.println("Number is negative");
		}
	}

}
