import java.util.*;
import java.io.*;

public class FEB_BR_triangles {
	static Scanner in;
	static PrintWriter out;
	static int N, x[], y[];

	public static void main(String[] args) throws IOException {

		in = new Scanner(new File("triangles.in"));
		out = new PrintWriter(new FileWriter("triangles.out"));
		init();
		solve();
		in.close();
		out.close();

	}

	static void init() throws IOException {
		N = in.nextInt();
		x = new int[N];
		y = new int[N];
		for(int i=0; i<N; i++) {
			x[i] = in.nextInt();
			y[i] = in.nextInt();
		}
	}

	static void solve() {
		double diffy = 0;
		double diffx = 0;
		double area = 0;
		double ans = 0;
		int ans2 = 0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(x[i] == x[j] && y[i] != y[j]) {
					diffx = Math.abs(y[i] - y[j]);
					for(int k=0; k<N; k++) {
						if(y[i] == y[k]) {
							diffy = Math.abs(x[i] - x[k]);
						}
						else if(y[j] == y[k]) {
							diffy = Math.abs(x[j] - x[k]);
						}
						area = diffy * diffx / 2;
						ans = Math.max(ans, area);
					}
				}
			}
		}
		ans2 = (int) (2 * ans);
		out.println(ans2);
	}

}