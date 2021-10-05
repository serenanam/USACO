import java.util.*;
import java.io.*;

public class FEB_BR_2 {
	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer st;
	static int n;
	static int[] x, y;
	static boolean[][] a;

	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));

		init();
		solve();
		in.close();

	}

	static void init() throws IOException {
		st = new StringTokenizer(in.readLine());
		n = Integer.parseInt(st.nextToken());
		x = new int[n];
		y = new int[n];

		for(int i=0; i<n; i++) {
			st = new StringTokenizer(in.readLine());
			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());
		}
//		System.out.println(Arrays.toString(x) + " " + Arrays.toString(y));
	}

	static void solve() {
//		StringBuilder sb = new StringBuilder();
		a = new boolean[1000][1000];
		for(int i=0; i<n; i++) {
			int t1 = x[i];
			int t2 = y[i];
//			System.out.println("first " + a1 + " " + a2);
		
			int ans = 0;
			a[t1][t2] = true;
			
			int cnt = 0;
			if(t2-1 >= 0 && a[t1][t2-1] == true) cnt++; //System.out.println(a1 + " " + (a2-1));
			if(t1-1 >= 0 && a[t1-1][t2] == true) cnt++; //System.out.println((a1-1) + " " + a2);
			if(t1+1 < a.length && a[t1+1][t2] == true) cnt++; //System.out.println((a1+1) + " " + a2);
			if(t2+1 < a.length && a[t1][t2+1] == true) cnt++; //System.out.println(a1 + " " + (a2+1));
			if(cnt == 3) ans++;
//			System.out.println(t1 + " " + (t2-1));
//			System.out.println((t1-1) + " " + t2);
//			System.out.println((t1 + 1) + " " + t2);
//			System.out.println(t1 + " " + (t2+1));
			for(int j=0; j<n; j++) {
				int a1 = x[j];
				int a2 = y[j];
				if(a1!=t1 && a2!=t2 && a[a1][a2] == true) {
					cnt = 0;
					if(a2-1 >= 0 && a[a1][a2-1] == true) cnt++; //System.out.println(a1 + " " + (a2-1));
					if(a1-1 >= 0 && a[a1-1][a2] == true) cnt++; //System.out.println((a1-1) + " " + a2);
					if(a1+1 < a.length && a[a1+1][a2] == true) cnt++; //System.out.println((a1+1) + " " + a2);
					if(a2+1 < a.length && a[a1][a2+1] == true) cnt++; //System.out.println(a1 + " " + (a2+1));
					if(cnt == 3) ans++;
				}
				
			}
			
//			System.out.println("cnt: " + cnt);
			System.out.println("!" + ans);
		}
		//a[a1][a2] != a[t1][t2] && 
//		System.out.println(Arrays.deepToString(a));

	}

}