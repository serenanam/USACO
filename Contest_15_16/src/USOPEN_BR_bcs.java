import java.util.*;
import java.io.*;

public class USOPEN_BR_bcs {
	static Scanner in;
	static PrintWriter out;
	static int N, K;
	static String[] org;
	static String[][] rest;

	public static void main(String[] args) throws IOException {

		in = new Scanner(new File("bcs.in"));
		out = new PrintWriter(new FileWriter("bcs.out"));
		init();
		solve();
		in.close();
		out.close();

	}

	static void init() throws IOException {
		N = in.nextInt();
		K = in.nextInt();
		rest = new String[K][N];
		org = new String[N];
		for(int i=0; i<N; i++) {
			org[i] = in.next();
		}

		for(int i=0; i<K; i++) {
			for(int j=0; j<N; j++) {
				rest[i][j] = in.next();
			}
		}
		System.out.println(Arrays.toString(org));
		System.out.println(Arrays.deepToString(rest));
	}

	static void solve() {
		int cnt = 0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(org[i].charAt(j) == '#') cnt++;
			}
		}
	}

}