import java.util.*;
import java.io.*;

public class DEC_SIL_haybales {
	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer st;
	static int N, Q, a[], lower, upper, n1, n2, ans;

	public static void main(String[] args) throws IOException {

		in =  new BufferedReader(new FileReader("haybales.in"));
		out = new PrintWriter(new FileWriter("haybales.out"));
		init();
		solve();
		in.close();
		out.close();

	}

	static void init() throws IOException {
		st = new StringTokenizer(in.readLine());
		N = Integer.parseInt(st.nextToken());
		Q = Integer.parseInt(st.nextToken());
		a = new int[N];
		st = new StringTokenizer(in.readLine());
		
		for(int i=0; i<N; i++) {
			a[i] =Integer.parseInt(st.nextToken());
		}
		Arrays.sort(a);
	}


	static void solve() throws IOException {
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<Q; i++) {
			st = new StringTokenizer(in.readLine());
			n1 = Integer.parseInt(st.nextToken());
			n2 = Integer.parseInt(st.nextToken());
			
			lower = Arrays.binarySearch(a, n1);
			if(lower < 0) lower = Math.abs(lower) - 1;
			upper = Arrays.binarySearch(a, n2);
			if(upper < 0) upper = Math.abs(upper) - 2;
			ans = upper - lower +1;
			sb.append(ans).append("\n");
		}
		out.print(sb.toString());
	}

}