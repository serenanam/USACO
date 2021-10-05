import java.util.*;
import java.io.*;

public class NumberSpiral {
	static Scanner in;
	static long N, x[], y[];

	public static void main(String[] args) throws IOException {

		in = new Scanner(System.in);
		init();
		solve();

	}

	static void init() throws IOException {
		N = in.nextLong();
		x = new long[(int) N];
		y = new long[(int) N];
		
		for(int i=0; i<N; i++) {
			y[i] = in.nextInt();
			x[i] = in.nextInt();
		}
	}

	static void solve() {
		long x1 = 0;
		long y1 = 0;
		long ans = 0;
		for(int i=0; i<N; i++) {
			x1 = x[i];
			y1 = y[i];
			if(x1 > y1) {
				if(x1%2 == 1) ans = x1 * x1 - y1 + 1;
				else ans = (x1-1) * (x1-1) + y1;
			}
			
			else {
				if(y1%2 == 0) ans = y1 * y1 - x1 + 1;
				else ans = (y1-1) * (y1-1) + x1;
			}
			System.out.println(ans);
		}
	}

}

