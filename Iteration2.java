package recursion;

public class Iteration2 {
	public static void main(String[] args) {
		int x = 1234567;
	   	while (x > 0) {
	   		System.out.print(x % 10);
	   		x = x / 10;
	   	 }
	}
}
