import java.util.*;
import java.io.*;
public class BaekJoon_numberball {
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
		}
		for(int i=0; i<n; i++) {
			low = Math.max(low, a[i]);
			high += a[i];
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
				high = mid - 1;
			}
			else {
				low = mid + 1;
//				high = mid - 1;
			}
		}
		
		System.out.println(ans);
		
		int s = 0; 
		int t = 0;
		for(int i=0; i<n; i++) {
			s+=a[i];
			if(s>ans) {
				s = a[i];
				m--;
				System.out.print(t + " ");
				t = 0;
			}
			t++;
			if(n-i == m) break;
		}
		while(m-- > 0) {
			System.out.println(t+" ");
			t = 1;
		}
		
	}
	
	static boolean check(int mid) {
		int group = 1;
		int cnt = 0;
		for(int i=0; i<n; i++) {
			if(cnt + a[i] <= mid) cnt+=a[i];
			else {
				group ++;
				cnt = a[i];
			}
		}
		
		return group <= m;
	}
}
