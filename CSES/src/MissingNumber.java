import java.util.*;
import java.io.*;

public class MissingNumber {
	static Scanner in;
	static int n, a[], sum, summiss;

	public static void main(String[] args) throws IOException {

		in = new Scanner(System.in);
		init();
		solve();

	}

	static void init() throws IOException {
		n = in.nextInt();
		summiss = 0;
		sum = 0;
		
		for(int i=0; i<n-1; i++) {
			summiss += in.nextInt();
		}
	}

	static void solve() {
		for(int i=1; i<=n; i++) {
			sum += i;
		}
		System.out.println(sum - summiss);
	}

}

