package eight;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class BracketsReading {
//Brackets
	public static void main(String[] args) throws FileNotFoundException {
		
		File fileRead = new File("Brackets.txt");
		
		Stack<Character> symbols = new Stack<>();
		try ( 
				Scanner input = new Scanner(fileRead);
		) {
			while (input.hasNext()) { // Continuously read chars 
				String line = input.nextLine();
				for (int i = 0; i < line.length(); i++) {
					char ch = line.charAt(i);// Push symbols (, {, and [ on to the stack
					if (ch == '(' || ch == '{' || ch == '[') {
						symbols.push(ch);
					} // Process stack
					else if (ch == ')' || ch == '}' || ch == ']') {
						processSymbols(symbols, ch);
					}
				}
			}
		}
		
		System.out.println("The file " +
			(symbols.isEmpty() ? "has" : "does not have") + " correct pairs.");	
	}
		
		private static void processSymbols(Stack<Character> stack, Character ch){
			// Remove matching symbols from stack
			if ((stack.peek() == '(' && ch == ')') ||
				 (stack.peek() == '[' && ch == ']') ||
				 (stack.peek() == '{' && ch == '}')) {
				stack.pop();	
			}
			else if ((stack.peek() != '(' && ch == ')') ||
				 (stack.peek() != '[' && ch == ']') ||
				 (stack.peek() != '{' && ch == '}')) {
				System.out.println("The file does not have" 
					+ " correct pairs.");
				System.exit(1);
			}
		}
		
	
}
