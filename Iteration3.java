package recursion;

import java.util.Scanner;

public class Iteration3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number ");
		int n = scanner.nextInt();
		
		int fin = 2;
		
		for (int i = 1; i < n; i++) {
			fin *= 2;
		}
		
		System.out.println("2 to the power of " + n + " is " + fin);
		
	}

}
