import java.util.*;
import java.io.*;

public class FEB_BR_balancing {
	static Scanner in;
	static PrintWriter out;
	static int N, B, M, x[], y[];
	static boolean a[][];

	public static void main(String[] args) throws IOException {

		in = new Scanner(new File("balancing.in"));
		out = new PrintWriter(new FileWriter("balancing.out"));
		init();
		solve();
		in.close();
		out.close();

	}

	static void init() throws IOException {
		N = in.nextInt();
		B = in.nextInt();
		x = new int[N];
		y = new int[N];
		a = new boolean[B][B];
		for(int i=0; i<N; i++) {
			x[i] = in.nextInt();
			y[i] = in.nextInt();
		}
	}

	static void solve() {
//		for(int i=0; i<N; i++) {
//			a[x[i]-1][y[i]-1] = true;
//		
//		}
		System.out.println(Arrays.deepToString(a));
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		int c4 = 0;
		int b1 = 0;
		int b2 = 0;
		int temp = 0;
		int M = Integer.MAX_VALUE;
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				for(int k=2; k<=B; k+=2) {
					for(int h=2; h<=B; h+=2) {
						if(x[i] < k) { 
							if(y[j] < h) {
								c2++;
							}
							else {
								c1++;
							}
						}
						else {
							if(y[j] < h) {
								c4++;
							}
							else {
								c3++;
							}
						}
						System.out.println(c1 + " " + c2 + " " + c3 + " " + c4);
						System.out.println();
						b1 = Math.max(c1, c2);
						b2 = Math.max(c3, c4);
						temp = Math.max(b1, b2);
						if(temp < M) M = temp;
						c1 = 0;
						c2 = 0;
						c3 = 0;
						c4 = 0;
					}
					
					
				}
				
			}

		}
		System.out.println(M);
	}

}