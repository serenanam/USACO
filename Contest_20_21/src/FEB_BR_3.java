import java.util.*;
import java.io.*;

public class FEB_BR_3 {
	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer st;
	static int N;
	static String a[];

	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		
		init();
		solve();
		in.close();


	}

	static void init() throws IOException {
		st = new StringTokenizer(in.readLine());
		N = Integer.parseInt(st.nextToken());
		a = new String[N];
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(in.readLine());
			String s = "";
			while(st.hasMoreTokens()) s += st.nextToken()+" ";
			a[i] = s;
		}
	}

	static void solve() {
		StringBuilder sb = new StringBuilder();
		int e = 0;
		int w = 0;
		int s = 0;
		int n = 0;
		for(int i=0; i<N; i++) {
			char[] t = a[i].toCharArray();
			for(int j=0; j<t.length; j++) {
				if(t[j] == 'N') n++;
				else if(t[j] == 'E') e++;
				else if(t[j] == 'W') w++;
				else if(t[j] == 'S') s++;
			}
//			System.out.println(s);
//			for(int j=0; j<s.length(); j++) {
//				if()
//			}
			if(n > w && s > e && n == s && w == e) System.out.println("CCW");
			else System.out.println("CW");
//			System.out.println(n + " " + s + " " + w + " " + e);
		}
		
	}

}