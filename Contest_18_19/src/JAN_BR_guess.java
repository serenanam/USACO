import java.util.*;
import java.io.*;

public class JAN_BR_guess {
	static BufferedReader in;
	static PrintWriter out;
	static int N, k;
	static StringTokenizer st;
	static ArrayList<String> a;

	public static void main(String[] args) throws IOException {

		in = new BufferedReader(new FileReader("guess.in"));
		out = new PrintWriter(new FileWriter("guess.out"));
		init();
		solve();
		in.close();
		out.close();

	}

	static void init() throws IOException {
		st = new StringTokenizer(in.readLine());
		N = Integer.parseInt(st.nextToken());
		a = new String[N][100];
		in.next();
		for(int i=0; i<N; i++) {
			for(int j=0; j<in.nextInt(); j++) {
				a[i][j] = in.next();
			}
		}
		System.out.println(Arrays.deepToString(a));
	}

	static void solve() {

	}

}