import java.util.*;
import java.io.*;

public class DEC_BR_grass {
	static Scanner in;
	static int N, x[], y[];
	static char d[];

	public static void main(String[] args) throws IOException {

		in = new Scanner(System.in);
		init();
		solve();

	}

	static void init() throws IOException {
		N = in.nextInt();
		d = new char[N];
		x = new int[N];
		y = new int[N];
		for(int i=0; i<N; i++) {
			d[i] = in.next().charAt(0);
			x[i] = in.nextInt();
			y[i] = in.nextInt();
		}
//		System.out.println("d: " + Arrays.toString(d) + " \nx: " + Arrays.toString(x) + "\ny: " + Arrays.toString(y));
	}

	static void solve() {
		for(int i=0; i<N; i++) {
			int ans = check(i);
			if(ans == Integer.MAX_VALUE) System.out.println("Infinity");
			else System.out.println(ans);
		}
	}
	
	static int check(int c) {
		int min = Integer.MAX_VALUE;
		if(d[c] == 'E') {
			for(int n=0; n<N; n++) {
				if(c == n || d[n] == 'E' || x[c] > x[n] || y[c] < y[n]) continue;
				int dx = x[n] - x[c];
				int dy = y[c] - y[n];
				
				if(dx > dy && check(n) >= dy) min = Math.min(min, dx);
			}
		}
		
		else {
			for(int n=0; n<N; n++) {
				if(c == n || d[n] == 'N' || x[c] < x[n] || y[c] > y[n]) continue;
				int dx2 = x[c] - x[n];
				int dy2 = y[n] - y[c];
				
				if(dy2 > dx2 && check(n) >= dx2) min = Math.min(min, dy2);
			}
		}
		return min;
		
	}

}

