package eight;

import java.util.Scanner;
import java.util.Stack;

public class PostfixNotation {
	
	public static void main(String[] args) {
		
				System.out.println("Enter an expression: ");
				Scanner sc = new Scanner(System.in);
				String expression = sc.nextLine();
				
				try {
					System.out.println(evaluateExpression(expression));
				} 
					catch (Exception ex) {
					System.out.println("Wrong expression: " + args[0]);
				}

			}

	public static int evaluateExpression(String expression) throws Exception {
		// Create operandStack to store operands
		Stack<Integer> operandStack = new Stack<>();
		
//		expression = insertBlanks(expression);

		// Extract operands and operators
		String[] tokens = expression.split(" ");

		// Scan tokens
		for (String token: tokens) {
			if (token.length() == 0) // Blank space
				continue; // Back to the loop to extract the next token
			else if (token.charAt(0) == '+' || token.charAt(0) == '-'||
						token.charAt(0) == '/' || token.charAt(0) == '*') {
					// Process all operands in the top of the stack
					processAnOperator(operandStack, token.charAt(0));
			}
			else if (Character.isDigit(token.charAt(0))){
				// Push an operand into the stack
				operandStack.push(Integer.parseInt(token));
			}
			else
				throw new Exception("Wrong expression");
		}

		// Return the result
		return operandStack.pop();
	}

	// Process one operator
	public static void processAnOperator(
			Stack<Integer> operandStack, char operator) {
		int op1 = operandStack.pop();
		int op2 = operandStack.pop();

		switch (operator) {
			case '+': operandStack.push(op2 + op1); break;
			case '-': operandStack.push(op2 - op1); break;
			case '/': operandStack.push(op2 / op1); break;
			case '*': operandStack.push(op2 * op1);
		}
	}

//	//Insert blanks around +, -, /, and * */
//	public static String insertBlanks(String s) {
//		String result = "";
//
//		for (int i = 0; i < s.length(); i++) {
//			if (s.charAt(i) == '+' || s.charAt(i) == '-' ||
//				 s.charAt(i) == '/' || s.charAt(i) == '*')
//				result += " " + s.charAt(i) + " ";
//			else
//				result += s.charAt(i);
//		}
//
//		return result;
//	}
}
