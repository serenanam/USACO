import java.util.*;
import java.io.*;

public class JAN_BR_stalls {
	static Scanner in;
	static int N, cowH[], stallH[], a[][], t[][];

	public static void main(String[] args) throws IOException {

		in = new Scanner(System.in);
		init();
		solve();

	}

	static void init() throws IOException {
		N = in.nextInt();
		cowH = new int[N];
		stallH = new int[N];
		a = new int[N][N];

		for(int i=0; i<N; i++) {
			cowH[i] = in.nextInt();
		}

		for(int i=0; i<N; i++) {
			stallH[i] = in.nextInt();
		}
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(cowH[i] <= stallH[j]) {
					a[i][j] = cowH[i];
				}
				else a[i][j] = -1;
			}
		}
//		System.out.println(Arrays.toString(cowH));
//		System.out.println(Arrays.toString(stallH));
//		System.out.println(Arrays.deepToString(a));
	}

	static void solve() {
		
		t = new int[N*N*N][N];
		for(int i=0; i<N*N*N; i++) {
			for(int j=0; j<(N-1)*2; j++) {
				for(int k=0; k<N; k++) {
					t[i][k] = cowH[k];
				}
			}
		}
		System.out.println(Arrays.deepToString(t));
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int cnt = 0;
//		int neg = 0;
//		for(int i=0; i<N; i++) {
//			for(int j=0; j<N; j++) {
//				if(a[i][j] != -1) cnt++;
//				else neg++;
//			}
//
//		}
//		System.out.println(cnt-(N+1));
//		
	}
}




