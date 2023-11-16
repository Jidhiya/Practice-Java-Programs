package JavaPrograms;

import java.util.Scanner;

public class SwapNumbers {
	
	public static void main(String[] args) {
		int a, b, temp;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numbers:");
		a = scan.nextInt();
		b = scan.nextInt();
		System.out.println("Before swapping:  a = " + a + " b = " +b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("After swapping: a = "+ a + " b = " +b);		

	}

}
