import java.util.*;
import java.io.*;

public class USOPEN_BR_art {
	static Scanner in;
	static PrintWriter out;
	static int N, a[][], p[], minc, maxc, minr, maxr;

	public static void main(String[] args) throws IOException {

		in = new Scanner(new File("art.in"));
		out = new PrintWriter(new FileWriter("art.out"));
		init();
		solve();
		in.close();
		out.close();

	}

	static void init() throws IOException {
		N = in.nextInt(); in.nextLine();
		a = new int[N][N];
		for(int i=0; i<N; i++) {
			String s = in.nextLine();
			for(int j=0; j<N; j++) a[i][j] = s.charAt(j) - '0';
		}
		System.out.println(Arrays.deepToString(a));
	}

	static void solve() {
		minr = Integer.MAX_VALUE;
		minc = Integer.MAX_VALUE;
		maxc = 0;
		maxr = 0;
		
		p = new int[10];
		boolean check = false;
		for(int key = 1; key<=9; key ++) {
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					if(a[i][j] == key) {
						check = true;
						minc = Math.min(minc, j);
						maxc = Math.max(maxc, j);
						minr = Math.min(minr, i);
						maxr = Math.min(maxr, i);
					}
				}
			}
			if(check && p[key] == 0) p[key] = 1;
			//System.out.println(minc + " " + maxc + " " + minr + " " + maxr);
			for(int x=minr; x<=maxr; x++) {
				for(int y=minc; y<=maxc; y++) {
					if(a[x][y] != key) {
						p[a[x][y]] = p[key] + 1;
						System.out.println(Arrays.toString(p));
					}
				}
			}
			check = false;
		}
		
		System.out.println(Arrays.toString(p));
		
	}

}