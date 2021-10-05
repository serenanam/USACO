import java.util.*;
import java.io.*;

public class FEB_BR_pails {
	static Scanner in;
	static PrintWriter out;
	static int X, Y, M, mpail;

	public static void main(String[] args) throws IOException {

		in = new Scanner(new File("pails.in"));
		out = new PrintWriter(new FileWriter("pails.out"));
		init();
		solve();
		in.close();
		out.close();

	}

	static void init() throws IOException {
		X = in.nextInt();
		Y = in.nextInt();
		M = in.nextInt();
//		System.out.println(X + " " + Y + " " + M);
	}

	static void solve() {
		mpail = 0;
		int temp = 0;
		for(int i=0; i*X <= M; i++) {
			for(int j=0; i*X + j*Y <= M; j++) {
				temp = i*X + j*Y;
				mpail = Math.max(mpail, temp);
				
			}
		}
		
		out.println(mpail);
	}

}