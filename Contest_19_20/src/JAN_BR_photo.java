import java.util.*;
import java.io.*;

public class JAN_BR_photo {
	static Scanner in;
	static PrintWriter out;
	static int N, a[], num[];

	public static void main(String[] args) throws IOException {

		in = new Scanner(new File("photo.in"));
		out = new PrintWriter(new FileWriter("photo.out"));
		init();
		solve();
		in.close();
		out.close();

	}

	static void init() throws IOException {
		N = in.nextInt();
		a = new int[N-1];
		num = new int[N];
		for(int i=0; i<N-1; i++) {
			a[i] = in.nextInt();
		}
		
		int j=1;
		for(int i=0; i<N; i++) {
			num[i] = j;
			j++;
		}
		System.out.println(Arrays.toString(num));
	}

	static void solve() {
		int keep1 = 0;
		int keep2 = 0;
		for(int i=0; i<N-1; i++) {
			for(int j=0; j<N; j++) {
				for(int k=j+1; k<N; k++) {
					if(num[j] + num[k] == a[i]) {
						keep1 = num[j];
						keep2 = num[k];
						break;
					}
				}
				if(keep1 > 0 && keep2 > 0) break;
			}
			
		}
	}

}