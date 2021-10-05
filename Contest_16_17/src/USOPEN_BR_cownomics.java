import java.util.*;
import java.io.*;

public class USOPEN_BR_cownomics {
	static Scanner in;
	static PrintWriter out;
	static int N, M;
	static String plain[], spot[];

	public static void main(String[] args) throws IOException {

		in = new Scanner(new File("cownomics.in"));
		out = new PrintWriter(new FileWriter("cownomics.out"));
		init();
		solve();
		in.close();
		out.close();

	}

	static void init() throws IOException {
		N = in.nextInt();
		M = in.nextInt();
		in.nextLine();
		spot = new String[N];
		plain = new String[N];
		for(int i=0; i<N; i++) {
			spot[i] = in.nextLine();
		}
		for(int i=0; i<N; i++) {
			plain[i] = in.nextLine();
		}
//		System.out.println(Arrays.toString(plain));
	}

	static void solve() {
		int temp = 0;
		int ans = 0;
		int cnt = 0;
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				for(int k=0; k<N; k++) {
					if(spot[k].charAt(i) != plain[j].charAt(i)) {
						temp++;
					}
					else break;
				}
				if(temp == N) cnt++;
				temp = 0;
			}
			if(cnt == N) ans++;
			cnt = 0;
		}
		out.println(ans);
	}

}