package recursion;

public class Recursion44 {
	public static void main(String[] args) {
		int[] list = {2,5,7,9};
		System.out.println(average(list, 4));
	}
	
	public static double average(int[] arr, int n) {
		return sum(arr, n, 0) / n;
	}
	public static double sum(int[] arr, int n, int result) {
		if(n == 0) {
			return result;
		} else {
			return sum( arr, n - 1, result + arr[n-1]);
		}
	}
}
