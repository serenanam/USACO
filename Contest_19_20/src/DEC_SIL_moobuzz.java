import java.util.*;
import java.io.*;

public class DEC_SIL_moobuzz {
	static Scanner in;
	static PrintWriter out;
	static int N, a[];

	public static void main(String[] args) throws IOException {

		in = new Scanner(new File("moobuzz.in"));
		out = new PrintWriter(new FileWriter("moobuzz.out"));
		init();
		solve();
		in.close();
		out.close();

	}

	static void init() throws IOException {
		N = in.nextInt();
		a = new int[]{0,1,2,4,7,8,11,13,14,16,17,19,22,23,26,28,29};
	}

	static void solve() {
		int i = N%16;
		int h = N/16;
		int j = h * 30;

		if(i == 0) j--;
		int ans = j + a[i];
//		System.out.println(i + " " + j + " " + h);
		out.println(ans);
	}

}