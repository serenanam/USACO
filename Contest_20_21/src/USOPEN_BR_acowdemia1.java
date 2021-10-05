import java.util.*;
import java.io.*;

public class USOPEN_BR_acowdemia1 {
	static Scanner in;
	static int N, L, a[];

	public static void main(String[] args) throws IOException {

		in = new Scanner(System.in);
		init();
		solve();

	}

	static void init() throws IOException {
		N = in.nextInt();
		L = in.nextInt();
		a = new int[N];
		for(int i=0; i<N; i++) {
			a[i] = in.nextInt();
		}
		//System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		//System.out.println(N + " " + L);
	}

	static void solve() {
		//		for(int i=0; i<N; i++) {
		//			a[i] += L;
		//			for(int j=keep; j<a[a.length-1]; j++) {
		//				int cnt = 0;
		//				for(int k=0; k<N; k++) {
		//					if(cnt <= j) {
		//						if(a[k] >= j) {
		//							cnt++;
		//						}
		//					}
		//					else break;
		//				}
		//				if(cnt >= j) maxh = j;
		//				else break;
		//			}
		//			keep = Math.max(maxh, keep);
		//			a[i] -=L;
		//		}
		int keep = 0;
		int x = a[0];
		int cnt = 0;
		for(int i=0; i<N; i++) {
			a[i] += L;
			for(int k=keep; k<a.length; k++) {
				for(int j=0; j<a.length; j++) {
					if(a[j] < x) break;
					else if(a[j] == x) cnt++;
				}
				if(cnt >= x) keep = x; 
				x = a[k];
			}
		}
		System.out.println(keep);
	}

}

