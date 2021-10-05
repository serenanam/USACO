import java.util.Arrays;

//binarySearch method
//lower bound
//upper bound

public class BinarySearch_0 {
	public static void main(String[] args) {
		int[] a = {2,6,3,7,1,13,10};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		int n = Arrays.binarySearch(a, 7);
		System.out.println(n);
		
		n = Arrays.binarySearch(a, 8);
		System.out.println(n);
		
		int lower = Math.abs(n) - 2; //lower bound
		System.out.println(a[lower]);
		
		int upper = Math.abs(n) - 1; //upper bound
		System.out.println(a[upper]);
	}
}
