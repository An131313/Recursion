package recursion;

import java.util.Scanner;

public class Iteration4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number ");
		double x = scanner.nextDouble();
		System.out.print("Enter a number ");
		int n = scanner.nextInt();
		
		double fin = x;
		int m = n;
		
		while (m > 1) {
			fin *= x;
	   		m--;
	   		System.out.println(fin);
	   		System.out.println(m);
	   	}
		
		System.out.println( x + " to the power of " + n + " is " + fin);
	}
}
