import java.util.*;
import java.io.*;

public class USOPEN_BR_socdist1 {
	static Scanner in;
	static PrintWriter out;
	static int N;
	static char a[];

	public static void main(String[] args) throws IOException {

		in = new Scanner(new File("socdist1.in"));
		out = new PrintWriter(new FileWriter("socdist1.out"));
		init();
		solve();
		in.close();
		out.close();

	}

	static void init() throws IOException {
		N = in.nextInt();
		in.nextLine();
		a = in.nextLine().toCharArray();
	}

	static void solve() {
		int count = 0;
		int b1int = 0;
		int b2int = -1;
		int index = 0;
		int b1ind = 0;
		int b2ind = 0;

		for(int i=0; i<N; i++) {

			if(a[i] == '0') {
				if(i == 0 || i > 0 && a[i-1] == '1') {
					index = i;
				}
				count++;

			}

			else  {
				if(count > b1int && count > b2int) {
					b2int = b1int;
					b2ind = b1ind;

					b1int = count;
					b1ind = index;

				}

				else if(count < b1int && count > b2int) {
					b2int = count;
					b2ind = index;
				}
				count = 0;
			}

			if(i == N-1 && a[i] == '0') {
				if(count > b1int && count > b2int) {
					b2int = b1int;
					b2ind = b1ind;

					b1int = count;
					b1ind = index;

				}

				else if(count < b1int && count > b2int) {
					b2int = count;
					b2ind = index;
				}
				count = 0;
			}

//			System.out.println("i=" + i + ": a[" + i + "]=" + a[i] + " ==> " + "count=" + count + " big " + b1ind + ": " + b1int + " small " + b2ind + ": " + b2int);
		}

		//		System.out.println("big " + b1ind + ": " + b1int + " small " + b2ind + ": " + b2int);

		int ans = b2int/2;
		if(b2int%2==1) ans += 1;
		out.println(ans);

	}
}

