package recursion;

import java.util.Scanner;

public class Recursion4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number ");
		double x = scanner.nextDouble();
		System.out.print("Enter a number ");
		int n = scanner.nextInt();
		System.out.println( x + " to the power of " + n + " is " + xMethod(n, x));
	}

	public static double xMethod(int n, double x) {
	   	 if (n == 1) 
	   		 return x;
	   	 
	     else 
	    	 return x * xMethod(n - 1, x);
	 }
}
