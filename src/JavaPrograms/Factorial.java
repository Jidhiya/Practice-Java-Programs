package JavaPrograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int fact =1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to print factorial:");
		int num = scan.nextInt();
		for (int i=2; i<=num ; i++) {
			fact *= i;
			
		}
		System.out.println("Factorial of " + num + " is " + fact);

	}

}
