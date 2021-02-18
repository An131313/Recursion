package recursion;

public class Recursion42 {
	public static void main(String[] args) {
	   	 System.out.println("Sum is " + xMethod(5));
	}

	public static int xMethod(int n) {
	   	 return xMethod(n, 1);
	}
	
	public static int xMethod(int n, int result) {
	   	 if (n == 1)
	   		 return result;
	   	 else
	   		 return xMethod(n - 1, result + n);
	}

}
