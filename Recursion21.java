package recursion;

import java.util.Scanner;

public class Recursion21 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number ");
		int x = scanner.nextInt();
		System.out.print( x + " is ");
		
		if (x == 0) {
			System.out.print("0");	
		} else if (odd(x) == 1) {
			System.out.print("odd");
		} else if (even(x) == 0) {
			System.out.print("even");
		} else {
			System.out.print("not a valid number");
		}
	}

	public static int odd(int x) {
	   	 if (x == 1) {
	   		 return 1;
	   	 } else if ( x < 1) {
	   		 return -1;
	   	 } else {
	    	 return odd(x - 2); 
	   	   }
	 }
	
	public static int even(int x) {
	   	 if (x == 0) {
	   		 return 0;
	   	} else if ( x < 0) {
	   		 return -1;
	   	} else {
	    	 return even(x - 2);
	   	}
	}
}
