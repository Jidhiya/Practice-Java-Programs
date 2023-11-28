package JavaPrograms;

import java.util.Scanner;

public class Avg {

	public static void main(String[] args) {
		int n; double sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range of numbers to calculate average");
		n = scan.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the " + n +" numbers");
		for(int i=0; i<n;i++) {
			a[i] = scan.nextInt();
		}
		for(int i=0; i<n;i++) {
			sum = sum + a[i] ;
		}
		System.out.println("Average is : " + sum/n);

	}

}
