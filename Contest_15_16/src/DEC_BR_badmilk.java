import java.util.*;
import java.io.*;

public class DEC_BR_badmilk {
	static Scanner in;
	static PrintWriter out;
	static int N, M, D, S;
	static triple a[];
	static boolean b[], c[][];
	public static void main(String[] args) throws IOException {

		in = new Scanner(new File("badmilk.in"));
		out = new PrintWriter(new FileWriter("badmilk.out"));
		init();
		solve();
		in.close();
		out.close();

	}

	static void init() throws IOException {
		N = in.nextInt();
		M = in.nextInt();
		D = in.nextInt();
		S = in.nextInt();
		a = new triple[D+S];
		
		for(int i=0; i<D; i++) {
			a[i] = new triple(in.nextInt()-1, in.nextInt()-1, in.nextInt());
//			System.out.println(a[i]);
		}
		
		for(int i=D; i<D+S; i++) {
			a[i] = new triple(in.nextInt()-1, -1, in.nextInt());
		}
		b = new boolean[M];
		Arrays.fill(b, true);
		c = new boolean[N][M];

		Arrays.sort(a);
//		System.out.println(Arrays.toString(a));
	}

	static void solve() {
		for(triple data: a) {
			if(data.milk == -1) {
				for(int i=0; i<M; i++) {
					if(!c[data.id][i]) b[i] = false;
				}
			}
			else {
				c[data.id][data.milk] = true;
			}
		}
		
		int ans = 0;
		int cnt = 0;
		for(int i=0; i<M; i++) {
			if(b[i]) {
				for(int j=0; j<N; j++) {
					if(c[j][i]) cnt++;
				}
			}
			ans = Math.max(ans, cnt);
			cnt = 0;
		}
		out.println(ans);
	}
}

class triple implements Comparable<triple> {
	public int id;
	public int milk;
	public int time;
	
	triple(int a, int b, int c) {
		id = a;
		milk = b;
		time = c;
	}

	@Override
	public int compareTo(triple that) {
		if(this.time == that.time) {
			if(this.milk < that.milk) return -1;
			else return 1;
		}
		else if(this.time < that.time) return -1;
		else return 1;
	}
	
	public String toString() {
		return time+ " " + id + " " + milk;
	}
}