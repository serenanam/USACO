import java.util.*;
import java.io.*;

public class USOPEN_SIL_lemonade {
	static Scanner in;
	static PrintWriter out;
	static int N, a[];

	public static void main(String[] args) throws IOException {

		in = new Scanner(new File("lemonade.in"));
		out = new PrintWriter(new FileWriter("lemonade.out"));
		init();
		solve();
		in.close();
		out.close();

	}

	static void init() throws IOException {
		N = in.nextInt();
		a = new int[N];
		for(int i=0; i<N; i++) {
			a[i] = in.nextInt();
		}

		Arrays.sort(a);
	}

	static void solve() {
		int cnt = 0;
		int ans = Integer.MAX_VALUE;
		for(int i=N-1; i>=0; i--) {
			for(int j=N-1; j>=0; j--) {
				if(cnt <= a[j] ) {
					cnt++;
				}
			}
			ans = Math.min(cnt, ans);
		}
		out.println(ans);
	}

}