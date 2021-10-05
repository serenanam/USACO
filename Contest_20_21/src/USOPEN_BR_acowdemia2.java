import java.util.*;
import java.io.*;

public class USOPEN_BR_acowdemia2 {
	static Scanner in;
	static int N, K;
	static String names[], labs[][];
	public static void main(String[] args) throws IOException {

		in = new Scanner(System.in);
		init();
		solve();

	}

	static void init() throws IOException {
		K = in.nextInt();
		N = in.nextInt();
		names = new String[N];
		labs = new String[K][N];
		
		for(int i=0; i<N; i++) {
			names[i] = in.next();
		}
		for(int i=0; i<K; i++) {
			for(int j=0; j<N; j++) {
				labs[i][j] = in.next();
			}
		}
		System.out.println(Arrays.toString(names));
		System.out.println(Arrays.deepToString(labs));
	}

	static void solve() {

	}

}

