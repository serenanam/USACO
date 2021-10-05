import java.util.*;
import java.io.*;

public class IncreasingArray {
	static Scanner in;
	static int n;
	static long a[];

	public static void main(String[] args) throws IOException {

		in = new Scanner(System.in);
		init();
		solve();

	}

	static void init() throws IOException {
		n = in.nextInt();
		a = new long[n];
		for(int i=0; i<n; i++) {
			a[i] = in.nextInt();
		}
	}

	static void solve() {
		long cnt = 0;
		long add = 0;
		for(int i=0; i<n-1; i++) {
			if(a[i+1] < a[i]) {
				cnt = a[i] - a[i+1];
				a[i+1] = a[i];
			}

			add += cnt;
			cnt = 0;
		}
		System.out.println(add);
	}

}

