package JavaPrograms;

import java.util.Scanner;

public class checkPrime {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scan.nextInt();
		if(checkPrime(num)) {
			System.out.println("Input value " + num + " is a prime number");
		}
		else
		{
			System.out.println("Input value " + num + " is not a prime number");
		}
		
	}
	public static boolean checkPrime(int n)
	{
		if(n<=1) {
			return false;
		}
		for (int i=2; i<n; i++) {
			if(n%i==0) {
				return false;
			}
			
		}
		return true;
		
	}

}