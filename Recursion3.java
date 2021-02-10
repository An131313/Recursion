package recursion;

import java.util.Scanner;

public class Recursion3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number ");
		int n = scanner.nextInt();
		System.out.println("2 to the power of " + n + " is " + xMethod(n));
	}

	public static int xMethod(int n) {
	   	 if (n == 1) 
	   		 return 2;
	   	 
	     else 
	    	 return 2 * xMethod(n - 1);
	 }
}