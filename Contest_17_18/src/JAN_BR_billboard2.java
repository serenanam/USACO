import java.util.*;
import java.io.*;

public class JAN_BR_billboard2 {
	static Scanner in;
	static PrintWriter out;
	static int x1, y1, x2, y2, bx1, by1, bx2, by2;
	static boolean a[][];

	public static void main(String[] args) throws IOException {

		in = new Scanner(new File("billboard.in"));
		out = new PrintWriter(new FileWriter("billboard.out"));
		init();
		solve();
		in.close();
		out.close();

	}

	static void init() throws IOException {
		x1 = in.nextInt() + 1000;
		y1 = in.nextInt() + 1000;
		x2 = in.nextInt() + 1000;
		y2 = in.nextInt() + 1000;
		
		bx1 = in.nextInt() + 1000;
		by1 = in.nextInt() + 1000;
		bx2 = in.nextInt() + 1000;
		by2 = in.nextInt() + 1000;
		
		a = new boolean[2001][2001];
	}

	static void solve() {
		for(int i=x1; i<x2; i++) {
			for(int j=y1; j<y2; j++) {
				a[i][j] = true;
			}
		}
		
		for(int i=bx1; i<bx2; i++) {
			for(int j=by1; j<by2; j++) {
				a[i][j] = false;
			}
		}
		
		int minx = Integer.MAX_VALUE;
		int maxx = Integer.MIN_VALUE;
		int miny = Integer.MAX_VALUE;
		int maxy = Integer.MIN_VALUE;
		
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length; j++) {
				if(a[i][j]) {
					if(i < minx) minx = i;
					if(i > maxx) maxx = i;
					if(j < miny) miny = j;
					if(j > maxy) maxy = j;
				}
			}

		}
		
		out.println((maxx - minx + 1) * (maxy - miny + 1));
	}

}

