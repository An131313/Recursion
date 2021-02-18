package recursion;

import java.util.Scanner;

public class Recursion43 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number ");
		int x = scanner.nextInt();
		System.out.print("Enter a number ");
		int n = scanner.nextInt();
		System.out.println( n + " to the power of " + x + " is " + powRecursive(x, n));
	}
	
	 public static int powRecursive(int x, int n) {
		 return powRecursive(x, n, 1);
       }
	 
    public static int powRecursive(int x, int n, int result) {
      	 if (n == 0) {
      		 return result;
      	 }
      	 
      	 return powRecursive(x, n - 1, result * x);
       }

}
