package JavaPrograms;

import java.util.Scanner;

public class multiplicationTable {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to print the multiplication table and the range: ");
		int num = scan.nextInt();
		int range = scan.nextInt();
//		int i = 1;
//		while(i<=range) {
//			System.out.println(num + " * " +i+ " = "+ num*i);
//			i++;
//			
//		}
		for (int i = 1; i<=range;i++) {
			System.out.println(num + " x " +i+ " = "+ num*i);
		}

	}

}
