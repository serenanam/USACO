import java.util.*;
import java.io.*;

public class DEC_SIL_citystate {
	static Scanner in;
	static PrintWriter out;
	static int N;
	static String key;
	static HashMap<String, Long> a;

	public static void main(String[] args) throws IOException {

		in = new Scanner(new File("citystate.in"));
		out = new PrintWriter(new FileWriter("citystate.out"));
		init();
		solve();
		in.close();
		out.close();

	}

	static void init() throws IOException {
		N = in.nextInt();
		a = new HashMap<String, Long>();
		for(int i=0; i<N; i++) {
			key = in.next().substring(0,2) + in.next();
			if(a.containsKey(key)) {
				a.put(key, a.get(key) + 1);
			}
			else {
				a.put(key, 1L);
			}
		}
//		System.out.println(a);
	}

	static void solve() {
		String temp = "";
		long ans = 0;
		for(String k: a.keySet()) {
			temp = k.substring(2) + k.substring(0,2);
			if(!k.equals(temp) && a.containsKey(temp)) {
				ans += a.get(k) * a.get(temp);
			}
			
		}
		ans /=2;
		out.println(ans);
	}

}