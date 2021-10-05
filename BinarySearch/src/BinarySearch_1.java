import java.util.*;
import java.io.*;
public class BinarySearch_1 {
	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer st; 
	static int n, m, a[], ans, low, high;
	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new FileReader("xxx.in"));
		out = new PrintWriter(new PrintWriter("xxx.out"));
		
		init();
		solve();
		in.close();
		out.close();
	}
	
	public static void init() {
		n, m, a[], low, high;
	
	}
	
	public static void solve() {
		ans = 0;
		int mid = 0;
		
		while(low <= high) {
			mid = (low+high) / 2;
			
			if(check(mid)) {
				ans = mid;
//				low = mid + 1;
				high = mid - 1;
			}
			else {
				low = mid + 1;
//				high = mid - 1;
			}
		}
		
		System.out.println(ans);
	}
	
	static boolean check(int mid) {
		int group = 1;
		for() {
			
		}
		
		return group <= m;
	}
}
