import java.util.*;
import java.io.*;

public class DEC_BR_backforth {
	static Scanner in;
	static PrintWriter out;
	static int b1[], b2[];

	public static void main(String[] args) throws IOException {

		in = new Scanner(new File("backforth.in"));
		out = new PrintWriter(new FileWriter("backforth.out"));
		init();
		solve();
		in.close();
		out.close();

	}

	static void init() throws IOException {
		b1 = new int[10];
		b2 = new int[10];
		for(int i=0; i<10; i++) {
			b1[i] = in.nextInt();
		}
		
		for(int i=0; i<10; i++) {
			b2[i] = in.nextInt();
		}
//		System.out.println(Arrays.toString(b1));
//		System.out.println(Arrays.toString(b2));
	}

	static void solve() {
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				
			}
		}
	}

}