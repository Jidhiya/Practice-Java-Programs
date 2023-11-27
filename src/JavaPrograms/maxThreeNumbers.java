package JavaPrograms;

import java.util.Scanner;

public class maxThreeNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the three numbers A,B and C: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		if (a>b) {
			if(a>c) {
			System.out.println("A is greatest");
			}
		
			else {
				
			System.out.println("C is greatest");
			}
		}
		else{ 
			if(b>c)
			{
			System.out.println("B is greatest");
			}
			else {
				
				System.out.println("C is greatest");
				}
		}
	}
}
		

	


