
import java.util.*;
import java.io.*;

public class DEC_BR_speeding {
	static Scanner in;
	static PrintWriter out;
	static int a[][], b[][], n, m, limit[], cow[];

	public static void main(String[] args) throws IOException {

		in = new Scanner(new File("speeding.in"));
		out = new PrintWriter(new FileWriter("speeding.out"));
		init();
		solve();
		in.close();
		out.close();

	}

	static void init() throws IOException {
		n = in.nextInt();
		m = in.nextInt();
		a = new int[n][2];
		b = new int[m][2];
		limit = new int[101];
		cow = new int[101];
		
		for(int i=0; i<n; i++) {
			a[i][0] = in.nextInt();
			a[i][1] = in.nextInt();
		}
		
		for(int i=0; i<m; i++) {
			b[i][0] = in.nextInt();
			b[i][1] = in.nextInt();
		}
//		System.out.println(Arrays.deepToString(a));
//		System.out.println(Arrays.deepToString(b));
		
	}

	static void solve() {
		int start = 0;
		int end = 0;
		int speed = 0;
		for(int i=0; i<n; i++) {
			end = start + a[i][0];
			speed = a[i][1];
			for(int j=start; j<end; j++) limit[j] = speed;
			start = end;
		}
//		System.out.println(Arrays.toString(limit));
		
		start = 0;
		end = 0;
		speed = 0;
		
		for(int i=0; i<m; i++) {
			end = start + b[i][0];
			speed = b[i][1];
			for(int j=start; j<end; j++) cow[j] = speed;
			start = end;
		}
//		System.out.println(Arrays.toString(cow));
		
		int max = 0;
		for(int i=0; i<101; i++) {
			max = Math.max(cow[i] - limit[i], max);
		}
		out.println(max);
				
	}

}

