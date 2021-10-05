import java.util.*;
import java.io.*;

public class DEC_BR_billboard {
	static Scanner in;
	static PrintWriter out;
	static int areab1, areab2, x1, y1, x2, y2, x3, y3, x4, y4, tx1, ty1, tx2, ty2;
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
		x3 = in.nextInt() + 1000;
		y3 = in.nextInt() + 1000;
		x4 = in.nextInt() + 1000;
		y4 = in.nextInt() + 1000;
		
		tx1 = in.nextInt() + 1000;
		ty1 = in.nextInt() + 1000;
		tx2 = in.nextInt() + 1000;
		ty2 = in.nextInt() + 1000;
		
		a = new boolean[2001][2001];
		
	}

	static void solve() {
		for(int i=x1; i<x2; i++) {
			for(int j=y1; j<y2; j++) {
				a[i][j] = true; 
			}
		}
		
		for(int i=x3; i<x4; i++) {
			for(int j=y3; j<y4; j++) {
				a[i][j] = true; 
			}
		}
		
		for(int i=tx1; i<tx2; i++) {
			for(int j=ty1; j<ty2; j++) {
				a[i][j] = false; 
			}
		}
		
		int count = 0;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length; j++) {
				if(a[i][j]) count++;
			}
		}
		
		out.println(count);
		
	}

}

