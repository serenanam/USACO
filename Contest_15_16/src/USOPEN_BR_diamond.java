import java.util.*;
import java.io.*;

public class USOPEN_BR_diamond {
	static Scanner in;
	static PrintWriter out;
	static int N, K, a[];

	public static void main(String[] args) throws IOException {

		in = new Scanner(new File("diamond.in"));
		out = new PrintWriter(new FileWriter("diamond.out"));
		init();
		solve();
		in.close();
		out.close();
	}

	static void init() throws IOException {
		N = in.nextInt();
		K = in.nextInt();
		a = new int[N];
		for(int i=0; i<N; i++) {
			a[i] = in.nextInt();
		}
	}

	static void solve() {
		int cnt = 0;
		int ans = 0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(a[i] >= a[j] && Math.abs(a[i] - a[j]) <= K) {
					cnt++;
				}
			}
			if(cnt > ans) ans = cnt;
			cnt = 0;
		}
		out.println(ans);
	}

}