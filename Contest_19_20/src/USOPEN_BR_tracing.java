import java.util.*;
import java.io.*;

public class USOPEN_BR_tracing {
	static Scanner in;
	static PrintWriter out;
	static int N, T, zero, kmin, kmax;
	static byTime a[];
	static char[] str;
	static boolean k[];


	public static void main(String[] args) throws IOException {

		in = new Scanner(new File("tracing.in"));
		out = new PrintWriter(new FileWriter("tracing.out"));
		init();
		solve();
		in.close();
		out.close();

	}

	static void init() throws IOException {
		N = in.nextInt();
		T = in.nextInt();
		in.nextLine();
		str = in.nextLine().toCharArray();

		a = new byTime[T];
		for(int i=0; i<T; i++) {
			a[i] = new byTime(in.nextInt(), in.nextInt(), in.nextInt());
		}

		Arrays.sort(a);
		System.out.println(Arrays.toString(str));
		System.out.println(Arrays.toString(a));
	}

	static void solve() {
		kmin = Integer.MAX_VALUE;
		kmax = Integer.MIN_VALUE;
		int c1, c2 = 0;
		k = new boolean[N];
		for(byTime data: a) {
			c1 = data.cowx-1;
			c2 = data.cowy-1;
			if(str[c1] == '0' || str[c2] == '0') { 
					k[c1] = true;
					k[c2] = true;
			}
		}
		int cnt = 0;
		for(int i=0; i<N; i++) {
			if(!k[i]) cnt++;
		}
		for(int i=0; i<N; i++) {
			for(int j=0; j)
		}
		System.out.println(cnt);
	}


}

class byTime implements Comparable<byTime> {
	public int time;
	public int cowx;
	public int cowy;

	byTime(int t, int x, int y) {
		time = t;
		cowx = x;
		cowy = y;
	}

	@Override
	public int compareTo(byTime that) {
		if(this.time == that.time) {
			if(this.cowx < that.cowx) return -1;
			return 1;
		}
		else if(this.time < that.time) return -1;
		else return 1;
	}

	public String toString() {
		return time + " " + cowx + " " + cowy;
	}

}