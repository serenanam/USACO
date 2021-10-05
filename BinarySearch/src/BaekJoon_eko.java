import java.util.*;
import java.io.*;
public class BaekJoon_eko {
	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer st; 
	static int n, m, a[], ans, low, high, b[];
	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));	
		init();
		solve();
		in.close();
	}
	
	public static void init() throws IOException {
		st = new StringTokenizer(in.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		a = new int[n];
		low = 0;
		high = 0;
		
		st = new StringTokenizer(in.readLine());
		for(int i=0; i<n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
			high = Math.max(high, a[i]);
		}
	}
	
	public static void solve() {
		ans = 0;
		int mid = 0;
		
		while(low <= high) {
			mid = (low+high) / 2;
			
			if(check(mid)) {
				ans = mid;
//				low = mid + 1;
				low = mid + 1;
			}
			else {
				high = mid - 1;
//				high = mid - 1;
			}
		}
		
		System.out.println(ans);

	}
	
	static boolean check(int mid) {
		long cut = 0;
		for(int i=0; i<n; i++) {
			if(a[i] > mid) cut += a[i] - mid;
		}

		return cut >= m;
	}
}
