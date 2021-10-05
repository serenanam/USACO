import java.util.*;
import java.io.*;

public class FEB_BR_revegetate {
	static Scanner in;
	static PrintWriter out;
	static int N, M;
	static String ans;
	static ArrayList<String> f[];
	static ArrayList<Integer> a[];


	public static void main(String[] args) throws IOException {

		in = new Scanner(new File("revegetate.in"));
		out = new PrintWriter(new FileWriter("revegetate.out"));
		init();
		solve();
		in.close();
		out.close();

	}

	static void init() throws IOException {
		N = in.nextInt();
		M = in.nextInt();

		a = new ArrayList[N];
		f = new ArrayList[N];

		for(int i=0; i<N; i++) {
			a[i] = new ArrayList<Integer>();
			f[i] = new ArrayList<String>();
		}

		for(int i=0; i<N; i++) {
			f[i].add("1");
			f[i].add("2");
			f[i].add("3");
			f[i].add("4");
		}

		for(int i=0; i<M; i++) {
			int x = in.nextInt()-1;
			int y = in.nextInt()-1;
			a[x].add(y);
			a[y].add(x);
		}

//		System.out.println(Arrays.toString(f));
//		System.out.println(Arrays.toString(a));

	}

	static void solve() {
		ans = "";
		for(int i=0; i<N; i++) {
			String seed = f[i].get(0);
			ans+=seed;
			for(int num: a[i]) {
				f[num].remove(seed);
			}
		}
		out.println(ans);
	}

}