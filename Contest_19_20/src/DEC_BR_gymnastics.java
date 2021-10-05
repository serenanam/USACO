import java.util.*;
import java.io.*;

public class DEC_BR_gymnastics {
	static Scanner in;
	static PrintWriter out;
	static int n, k, c[][];

	public static void main(String[] args) throws IOException {

		in = new Scanner(new File("gymnastics.in"));
		out = new PrintWriter(new FileWriter("gymnastics.out"));
		init();
		solve();
		in.close();
		out.close();

	}

	static void init() throws IOException {
		k = in.nextInt();
		n = in.nextInt();
		c = new int[k][n];
		for(int i=0; i<k; i++) {
			for(int j=0; j<n; j++) {
				c[i][in.nextInt()-1] = j;
			}
		}
	}

	static void solve() {
		int cnt1 = 0;
		int cnt2 = 0;
		int ans = 0;
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				for(int p=0; p<k; p++) {
					if(c[p][i] < c[p][j]) cnt1++;
					else cnt2++;
				}
				if(cnt1 == k || cnt2 == k) ans++;
				cnt1 = 0;
				cnt2 = 0;
			}
		}
		
		out.println(ans);
	}

}



